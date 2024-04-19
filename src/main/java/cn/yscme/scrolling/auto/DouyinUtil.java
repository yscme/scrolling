package cn.yscme.scrolling.auto;

import cn.yscme.scrolling.auto.douyin.*;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import com.microsoft.playwright.*;
import cn.yscme.scrolling.auto.douyin.Response;
import com.microsoft.playwright.options.LoadState;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.util.Duration;
public class DouyinUtil {

    public void start(long room_id, Label timerLabel, Label peopleLabel, ObservableList<String> chatMessages,  ObservableList<String> giftMessages,  ObservableList<String> otherMessages,
                      ListView<String> chatListView,ListView<String> giftListView,ListView<String> otherListView){
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(true));
            BrowserContext context = browser.newContext();
//            Map<String,String> map=new HashMap();
//            map.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36 Edg/123.0.0.0");
//            context.setExtraHTTPHeaders(map);
            // 浏览某个网页
            Page page = context.newPage();
            page.onWebSocket(webSocket -> {
                System.err.println(webSocket.url());
                // 创建一个 Timeline 对象，指定时间间隔为 1 秒
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
                    int timeSeconds = 0;
                    @Override
                    public void handle(ActionEvent event) {
                        // 每次时间间隔执行的任务
                        timeSeconds++;
                        Platform.runLater(()->{
                            timerLabel.setText(timeSeconds +"秒");
                        });
                    }
                }));

                // 设置 Timeline 为循环执行
                timeline.setCycleCount(Timeline.INDEFINITE);
                // 启动 Timeline，开始计时
                timeline.play();

                  webSocket.onFrameReceived(webSocketFrame -> {
                      System.err.println(webSocketFrame.hashCode());
                      parse(webSocketFrame.binary(),peopleLabel,chatMessages,giftMessages,otherMessages,chatListView,giftListView,otherListView);
                  });
            });
            page.navigate("https://live.douyin.com/"+room_id);
            page.waitForLoadState(LoadState.LOAD);
            // 在页面中注入 JavaScript
            String script = "const a=new KeyboardEvent('keydown',{key:'Virtual_Alt',keyCode:18,bubbles:!0,cancelable:!0}),b=document.documentElement;setInterval(()=>{b.dispatchEvent(a)},6e4),b.addEventListener('keydown',c=>{'Virtual_Alt'===c.key&&console.log('[防挂机处理] 按下了',c.key)}),WebSocket.prototype.close=function(){},function(){function a(a){let b=new RegExp(\"(^|&)\"+a+\"=([^&]*)(&|$)\"),c=window.location.search.substr(1).match(b);return null!==c?unescape(c[2]):null}if(\"true\"===a(\"pause\")){let b=setInterval(()=>{let c=document.querySelector(\".xgplayer-play\");if(c){let a=c.getAttribute(\"data-state\");\"play\"===a&&(c.click(),clearInterval(b),console.log(\"已自动暂停播放\"))}},500)}}()";
            page.evaluate(script);
            while(true){
                try {
                    page.content();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void parse(byte[] message, Label peopleLabel, ObservableList<String> chatMessages, ObservableList<String> giftMessages, ObservableList<String> otherMessages,
                      ListView<String> chatListView,ListView<String> giftListView,ListView<String> otherListView) {
        try {
            PushFrameOrBuilder pushFrame = PushFrame.parseFrom(message);
            Response response=Response.parseFrom(uncompress(pushFrame.getPayload()));
            // 返回直播间服务器链接存活确认消息，便于持续获取数据
//            if (response.getNeedAck()) {
//                PushFrame.newBuilder()
//                        .setLogId(pushFrame.getLogId())
//                        .setPayloadType("ack")
//                        .setPayload(response.getInternalExtBytes())
//                        .build();
////                webSocket.sendBinary(ByteString.copyFrom(pushFrame.getPayload()).toByteArray());
////                session.sendMessage(new BinaryMessage(pushFrame.getPayload().toByteArray()));
//            }
            // 根据消息类别解析消息体
            for (Message msg : response.getMessagesListList()) {
                String method = msg.getMethod();
                try {
                    switch (method) {
                        case "WebcastChatMessage":
                            parseChatMsg(msg.getPayload(),chatMessages,chatListView);
                            break;
                        case "WebcastGiftMessage":
                            parseGiftMsg(msg.getPayload(),giftMessages,giftListView);
                            break;
                        case "WebcastLikeMessage":
                            parseLikeMsg(msg.getPayload(),otherMessages,otherListView);
                            break;
                        case "WebcastMemberMessage":
                            parseMemberMsg(msg.getPayload(),otherMessages,otherListView);
                            break;
                        case "WebcastSocialMessage":
                            parseSocialMsg(msg.getPayload(),otherMessages,otherListView);
                            break;
                        case "WebcastRoomUserSeqMessage":
                            parseRoomUserSeqMsg(msg.getPayload(),peopleLabel);
                            break;
                        case "WebcastFansclubMessage":
                            parseFansclubMsg(msg.getPayload(),otherMessages,otherListView);
                            break;
                        case "WebcastControlMessage":
                            parseControlMsg(msg.getPayload(),otherMessages,otherListView);
                            break;
                        case "WebcastEmojiChatMessage":
                            parseEmojiChatMsg(msg.getPayload(),chatMessages,chatListView);
                            break;
                        case "WebcastRoomStatsMessage":
                            parseRoomStatsMsg(msg.getPayload(),otherMessages,otherListView);
                            break;
                        case "WebcastRoomMessage":
                            parseRoomMsg(msg.getPayload(),otherMessages,otherListView);
                            break;
                        case "WebcastRoomRankMessage":
                            parseRankMsg(msg.getPayload());
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }
    //聊天消息
    public void parseChatMsg(ByteString byteString,ObservableList<String> chatMessages,ListView<String> chatListView) throws InvalidProtocolBufferException {
        ChatMessage message= ChatMessage.parseFrom(byteString);
        String user_name=message.getUser().getNickName();
        Long id= message.getUser().getId();
        String content=message.getContent();
        Platform.runLater(() -> {
            chatMessages.add("【"+user_name+"】:"+content);
            chatListView.scrollTo(chatMessages.size());
        });
    }
    //礼物消息
    public void parseGiftMsg(ByteString byteString,ObservableList<String> giftMessages,ListView<String> giftListView) throws InvalidProtocolBufferException {
        GiftMessage message=GiftMessage.parseFrom(byteString);
        //是否连击
        boolean combo=message.getGift().getCombo();
        String user_name=message.getUser().getNickName();
        String gift_name=message.getGift().getName();
        long gift_cnt= message.getComboCount();
        Platform.runLater(() -> {
            giftMessages.add("【"+user_name+"】："+(combo?"连击":"")+"送出"+gift_cnt+"个"+gift_name);
            giftListView.scrollTo(giftMessages.size());
        });

    }
    //点赞消息
    public void parseLikeMsg(ByteString byteString,ObservableList<String> otherMessages,ListView<String> otherListView) throws InvalidProtocolBufferException {
        LikeMessage message=LikeMessage.parseFrom(byteString);
        String user_name=message.getUser().getNickName();
        long count=message.getCount();
        Platform.runLater(() -> {
            otherMessages.add("【"+user_name+"】点赞了"+count+"次");
            otherListView.scrollTo(otherMessages.size());
        });

    }
    //进来直播间
    public void parseMemberMsg(ByteString byteString,ObservableList<String> otherMessages,ListView<String> otherListView) throws InvalidProtocolBufferException {
        MemberMessage message=MemberMessage.parseFrom(byteString);
        String user_name=message.getUser().getNickName();
        Long user_id=message.getUserId();
        int gender=message.getUser().getGender();
        Platform.runLater(() -> {
            otherMessages.add("【"+user_name+"】["+(gender==1?'男':'女')+"]进入了直播间");
            otherListView.scrollTo(otherMessages.size());
        });

    }
    //关注消息
    public void parseSocialMsg(ByteString byteString,ObservableList<String> otherMessages,ListView<String> otherListView) throws InvalidProtocolBufferException {
        SocialMessage message=SocialMessage.parseFrom(byteString);
        String user_name=message.getUser().getNickName();
        Long user_id=message.getUser().getId();
        Platform.runLater(() -> {
            otherMessages.add("【"+user_name+"】 关注了主播");
            otherListView.scrollTo(otherMessages.size());
        });

    }
    //直播间统计
    public void parseRoomUserSeqMsg(ByteString byteString,Label peopleLabel) throws InvalidProtocolBufferException {
        RoomUserSeqMessage message=RoomUserSeqMessage.parseFrom(byteString);
        Long current=message.getTotal();
        String total= message.getTotalPvForAnchor();
        Platform.runLater(()->{
            peopleLabel.setText("当前在线人数:"+current+",累计观看人数:"+total);
        });
    }
    //粉丝团消息
    public void parseFansclubMsg(ByteString byteString,ObservableList<String> otherMessages,ListView<String> otherListView) throws InvalidProtocolBufferException {
        FansclubMessage message=FansclubMessage.parseFrom(byteString);
        String content=message.getContent();
        Platform.runLater(() -> {
            otherMessages.add("【粉丝团】"+content);
            otherListView.scrollTo(otherMessages.size());
        });

    }
    //表情包消息
    public void parseEmojiChatMsg(ByteString byteString,ObservableList<String> chatMessages ,ListView<String> chatListView)throws InvalidProtocolBufferException {
        EmojiChatMessage message=EmojiChatMessage.parseFrom(byteString);
        Long emoji_id= message.getEmojiId();
        String user_name=message.getUser().getNickName();
        Common common =message.getCommon();
        String default_content = message.getDefaultContent();
        Platform.runLater(() ->{
            chatMessages.add("【表情包】"+emoji_id+",【"+user_name+"】,common:"+common+",default_content:"+default_content);
            chatListView.scrollTo(chatMessages.size());
        });

    }
    //直播间消息
    public void parseRoomMsg(ByteString byteString,ObservableList<String> otherMessages,ListView<String> otherListView) throws InvalidProtocolBufferException {
        RoomMessage message=RoomMessage.parseFrom(byteString);
        Common common=message.getCommon();
        long room_id=common.getRoomId();
        Platform.runLater(() ->{
            otherMessages.add("【直播间id】:"+room_id);
            otherListView.scrollTo(otherMessages.size());
        });


    }
    //直播间消息统计
    public void parseRoomStatsMsg(ByteString byteString,ObservableList<String> otherMessages,ListView<String> otherListView) throws InvalidProtocolBufferException {
        RoomStatsMessage message=RoomStatsMessage.parseFrom(byteString);
        String display_long=message.getDisplayLong();
        Platform.runLater(() -> {
            otherMessages.add("【直播间统计】:"+display_long);
            otherListView.scrollTo(otherMessages.size());
        });

    }
    public void parseRankMsg(ByteString byteString) throws InvalidProtocolBufferException {
        RoomRankMessage message=RoomRankMessage.parseFrom(byteString);
        List<RoomRankMessage.RoomRank> ranks_list= message.getRanksListList();
//        System.out.println("【直播间排行榜】:"+ranks_list);
    }
    public void parseControlMsg(ByteString byteString,ObservableList<String> otherMessages,ListView<String> otherListView) throws InvalidProtocolBufferException {
        ControlMessage message=ControlMessage.parseFrom(byteString);
        System.err.println(message);

        if(message.getStatus()==3){
            Platform.runLater(() -> {
                otherMessages.add("【直播间已结束】");
                otherListView.scrollTo(otherMessages.size());
            });
        }
    }
    public static byte[] uncompress(ByteString bytes1) {
        final byte[] bytes = bytes1.toByteArray();
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (ByteArrayInputStream in = new ByteArrayInputStream(bytes);
             GZIPInputStream ungzip = new GZIPInputStream(in)) {
            byte[] buffer = new byte[8192]; // 调整缓冲区大小为 8192
            int n;
            while ((n = ungzip.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out.toByteArray();
    }
}
