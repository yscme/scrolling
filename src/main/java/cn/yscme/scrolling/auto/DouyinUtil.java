package cn.yscme.scrolling.auto;

import cn.yscme.scrolling.auto.douyin.*;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import com.microsoft.playwright.*;
import cn.yscme.scrolling.auto.douyin.Response;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.util.Duration;

public class DouyinUtil {

    public void start(long room_id,Label timerLabel,Label peopleLabel,TextArea chatTextArea,TextArea giftTextArea,TextArea otherTextArea){
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.firefox().launch();
            BrowserContext context = browser.newContext();
            // 浏览某个网页
            Page page = context.newPage();
            page.onWebSocket(webSocket -> {
                // 创建一个 Timeline 对象，指定时间间隔为 1 秒
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
                    int timeSeconds = 0;
                    @Override
                    public void handle(ActionEvent event) {
                        // 每次时间间隔执行的任务
                        timeSeconds++;
                        timerLabel.setText(timeSeconds +"秒");
                    }
                }));

                // 设置 Timeline 为循环执行
                timeline.setCycleCount(Timeline.INDEFINITE);
                // 启动 Timeline，开始计时
                timeline.play();

                  webSocket.onFrameReceived(webSocketFrame -> {
                      parse(webSocketFrame.binary(),peopleLabel,chatTextArea,giftTextArea,otherTextArea);
                  });
            });
            page.navigate("https://live.douyin.com/"+room_id);
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
    public void parse(byte[] message,Label peopleLabel,TextArea chatTextArea,TextArea giftTextArea,TextArea otherTextArea) {
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
                            parseChatMsg(msg.getPayload(),chatTextArea);
                            break;
                        case "WebcastGiftMessage":
                            parseGiftMsg(msg.getPayload(),giftTextArea);
                            break;
                        case "WebcastLikeMessage":
                            parseLikeMsg(msg.getPayload(),otherTextArea);
                            break;
                        case "WebcastMemberMessage":
                            parseMemberMsg(msg.getPayload(),otherTextArea);
                            break;
                        case "WebcastSocialMessage":
                            parseSocialMsg(msg.getPayload(),otherTextArea);
                            break;
                        case "WebcastRoomUserSeqMessage":
                            parseRoomUserSeqMsg(msg.getPayload(),peopleLabel);
                            break;
                        case "WebcastFansclubMessage":
                            parseFansclubMsg(msg.getPayload(),otherTextArea);
                            break;
                        case "WebcastControlMessage":
                            parseControlMsg(msg.getPayload(),otherTextArea);
                            break;
                        case "WebcastEmojiChatMessage":
                            parseEmojiChatMsg(msg.getPayload(),chatTextArea);
                            break;
                        case "WebcastRoomStatsMessage":
                            parseRoomStatsMsg(msg.getPayload(),otherTextArea);
                            break;
                        case "WebcastRoomMessage":
                            parseRoomMsg(msg.getPayload(),otherTextArea);
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
    public void parseChatMsg(ByteString byteString,TextArea chatTextArea) throws InvalidProtocolBufferException {
        ChatMessage message= ChatMessage.parseFrom(byteString);
        String user_name=message.getUser().getNickName();
        Long id= message.getUser().getId();
        String content=message.getContent();
        Platform.runLater(()->{
            chatTextArea.appendText("【"+user_name+"】:"+content+"\n");
        });
    }
    //礼物消息
    public void parseGiftMsg(ByteString byteString,TextArea giftTextArea) throws InvalidProtocolBufferException {
        GiftMessage message=GiftMessage.parseFrom(byteString);
        String user_name=message.getUser().getNickName();
        String gift_name=message.getGift().getName();
        Long gift_cnt= message.getComboCount();
        Platform.runLater(()->{
            giftTextArea.appendText("【"+user_name+"】：送出"+gift_cnt+"个"+gift_name+"\n");
        });

    }
    //点赞消息
    public void parseLikeMsg(ByteString byteString,TextArea otherTextArea) throws InvalidProtocolBufferException {
        LikeMessage message=LikeMessage.parseFrom(byteString);
        String user_name=message.getUser().getNickName();
        Long count=message.getCount();
        Platform.runLater(()->{
            otherTextArea.appendText("【"+user_name+"】点赞了"+count+"次\n");
        });

    }
    //进来直播间
    public void parseMemberMsg(ByteString byteString,TextArea otherTextArea) throws InvalidProtocolBufferException {
        MemberMessage message=MemberMessage.parseFrom(byteString);
        String user_name=message.getUser().getNickName();
        Long user_id=message.getUserId();
        int gender=message.getUser().getGender();
        Platform.runLater(()->{
            otherTextArea.appendText("【"+user_name+"】["+(gender==1?'男':'女')+"]进入了直播间\n");
        });
    }
    //关注消息
    public void parseSocialMsg(ByteString byteString,TextArea otherTextArea) throws InvalidProtocolBufferException {
        SocialMessage message=SocialMessage.parseFrom(byteString);
        String user_name=message.getUser().getNickName();
        Long user_id=message.getUser().getId();
        Platform.runLater(()->{
            otherTextArea.appendText("【"+user_name+"】 关注了主播\n");
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
    public void parseFansclubMsg(ByteString byteString,TextArea otherTextArea) throws InvalidProtocolBufferException {
        FansclubMessage message=FansclubMessage.parseFrom(byteString);
        String content=message.getContent();
        Platform.runLater(()->{
            otherTextArea.appendText("【粉丝团】"+content+"\n");
        });
    }
    //表情包消息
    public void parseEmojiChatMsg(ByteString byteString,TextArea chatTextArea) throws InvalidProtocolBufferException {
        EmojiChatMessage message=EmojiChatMessage.parseFrom(byteString);
        Long emoji_id= message.getEmojiId();
        String user_name=message.getUser().getNickName();
        Common common =message.getCommon();
        String default_content = message.getDefaultContent();
        Platform.runLater(()->{
            chatTextArea.appendText("【表情包】"+emoji_id+",【"+user_name+"】,common:"+common+",default_content:"+default_content+"\n");
        });
    }
    //直播间消息
    public void parseRoomMsg(ByteString byteString,TextArea otherTextArea) throws InvalidProtocolBufferException {
        RoomMessage message=RoomMessage.parseFrom(byteString);
        Common common=message.getCommon();
        long room_id=common.getRoomId();
        Platform.runLater(()->{
            otherTextArea.appendText("【直播间id】:"+room_id+"\n");
        });
    }
    //直播间消息统计
    public void parseRoomStatsMsg(ByteString byteString,TextArea otherTextArea) throws InvalidProtocolBufferException {
        RoomStatsMessage message=RoomStatsMessage.parseFrom(byteString);
        String display_long=message.getDisplayLong();
        Platform.runLater(()->{
            otherTextArea.appendText("【直播间统计】:"+display_long+"\n");
        });
    }
    public void parseRankMsg(ByteString byteString) throws InvalidProtocolBufferException {
        RoomRankMessage message=RoomRankMessage.parseFrom(byteString);
        List<RoomRankMessage.RoomRank> ranks_list= message.getRanksListList();
//        System.out.println("【直播间排行榜】:"+ranks_list);
    }
    public void parseControlMsg(ByteString byteString,TextArea otherTextArea) throws InvalidProtocolBufferException {
        ControlMessage message=ControlMessage.parseFrom(byteString);
        System.err.println(message);
        if(message.getStatus()==3){
            Platform.runLater(()->{
                otherTextArea.appendText("【直播间已结束】\n");
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
