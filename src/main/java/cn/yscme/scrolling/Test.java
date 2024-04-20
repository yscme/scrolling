package cn.yscme.scrolling;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.protobuf.util.JsonFormat;
import cn.yscme.scrolling.auto.DouyinUtil;
import cn.yscme.scrolling.auto.douyin.PushFrame;
import cn.yscme.scrolling.auto.douyin.PushFrameOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public class Test {
    private String ttwid;
    private String roomId;
    private String liveId;
    private String liveUrl;
    private String userAgent;
    private OkHttpClient client;

    public static String encodeURLParameters(String url) {
        StringBuilder encodedUrl = new StringBuilder();

        try {
            // 正则表达式用于匹配URL中的参数部分
            Pattern pattern = Pattern.compile("\\?([^#]*)");
            Matcher matcher = pattern.matcher(url);

            // 如果匹配到了参数部分，则对参数进行编码
            if (matcher.find()) {
                String parameters = matcher.group(1);
                String[] pairs = parameters.split("&");
                for (String pair : pairs) {
                    int idx = pair.indexOf("=");
                    if (idx != -1) {
                        String key = pair.substring(0, idx);
                        String value = pair.substring(idx + 1);
                        if (encodedUrl.length() > 0) {
                            encodedUrl.append("&");
                        }
                        encodedUrl.append(URLEncoder.encode(key, StandardCharsets.UTF_8.toString()));
                        encodedUrl.append("=");
                        encodedUrl.append(URLEncoder.encode(value, StandardCharsets.UTF_8.toString()));
                    }
                }
                // 将编码后的参数替换原始URL中的参数部分
                return url.replace(parameters, encodedUrl.toString());
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return url;
    }
    public static byte[] convertToUtf8Bytes(String str) {
        int len = str.length();
        byte[] bytes = new byte[len * 4]; // 一个字符最多占用4个字节

        int idx = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch < 128) {
                bytes[idx++] = (byte) ch;
            } else if (ch < 2048) {
                bytes[idx++] = (byte) (192 + (ch >> 6));
                bytes[idx++] = (byte) (128 + (ch & 63));
            } else {
                bytes[idx++] = (byte) (224 + (ch >> 12));
                bytes[idx++] = (byte) (128 + ((ch >> 6) & 63));
                bytes[idx++] = (byte) (128 + (ch & 63));
            }
        }

        // 截取实际有效的字节
        byte[] result = new byte[idx];
        System.arraycopy(bytes, 0, result, 0, idx);
        return result;
    }

    public Test(String liveId) {
        this.liveId = liveId;
//        this.ttwid = None;
//        this.roomId = None;
        this.liveId = liveId;
        this.liveUrl = "https://live.douyin.com/";
        this.userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36";
        client = new OkHttpClient();
    }

    public void start() {
        connectWebSocket();
    }

    private String generateMsToken(int length) {
        StringBuilder randomStr = new StringBuilder();
        String baseStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789=_";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomStr.append(baseStr.charAt(random.nextInt(baseStr.length())));
        }
        return randomStr.toString();
    }

    private String generateTtwid() {
        Request request = new Request.Builder()
                .url(liveUrl)
                .addHeader("User-Agent", userAgent)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.header("Set-Cookie");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getTtwid() {
        if (ttwid == null) {
            ttwid = generateTtwid();
            System.out.println(ttwid);
        }
        return ttwid;
    }

    private String getRoomId() {
        if (roomId == null) {
            String url = liveUrl + liveId;
            Request request = new Request.Builder()
                    .url(url)
                    .addHeader("User-Agent", userAgent)
                    .addHeader("cookie", "ttwid=" + getTtwid() + "&msToken=" + generateMsToken(107) + "; __ac_nonce=0123407cc00a9e438deb4")
                    .build();
            try (Response response = client.newCall(request).execute()) {
                String responseBody = response.body().string();
                Pattern pattern = Pattern.compile(",\\\\\"roomId\\\\\":\\\\\"(\\d+)\\\\\",");
                Matcher matcher = pattern.matcher(responseBody);
                if (matcher.find()) {
                    roomId = matcher.group(1);
                    System.out.println(roomId);
                } else {
                    System.out.println("No match found for roomId");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return roomId;
    }
    private void connectWebSocket(){
        String wss = "wss://webcast3-ws-web-lq.douyin.com/webcast/im/push/v2/?app_name=douyin_web&version_code=180800&webcast_sdk_version=1.3.0&update_version_code=1.3.0&compress=gzip&internal_ext=internal_src:dim|wss_push_room_id:" +
                getRoomId() +
                "|wss_push_did:" +
                getRoomId() +
                "|dim_log_id:202302171547011A160A7BAA76660E13ED|fetch_time:1676620021641|seq:1|wss_info:0-1676620021641-0-0|wrds_kvs:WebcastRoomStatsMessage-1676620020691146024_WebcastRoomRankMessage-1676619972726895075_AudienceGiftSyncData-1676619980834317696_HighlightContainerSyncData-2&cursor=t-1676620021641_r-1_d-1_u-1_h-1&host=https://live.douyin.com&aid=6383&live_id=1&did_rule=3&debug=false&endpoint=live_pc&support_wrds=1&im_path=/webcast/im/fetch/&user_unique_id=" +
                getRoomId() +
                "&device_platform=web&cookie_enabled=true&screen_width=1440&screen_height=900&browser_language=zh&browser_platform=MacIntel&browser_name=Mozilla&browser_version=5.0%20(Macintosh;%20Intel%20Mac%20OS%20X%2010_15_7)%20AppleWebKit/537.36%20(KHTML,%20like%20Gecko)%20Chrome/110.0.0.0%20Safari/537.36&browser_online=true&tz_name=Asia/Shanghai&identity=audience&room_id=" +
                getRoomId() +
                "&heartbeatDuration=0&signature=00000000";
        wss=encodeURLParameters(wss);
        WebSocketClient client = new WebSocketClient(URI.create(wss)) {
            @Override
            public void onMessage(ByteBuffer bytes1) {
                PushFrameOrBuilder pushFrame = null;
                try {
                    pushFrame = PushFrame.parseFrom(bytes1);
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException(e);
                }
                byte[] bytes= DouyinUtil.uncompress(pushFrame.getPayload());
                if(bytes==null){
                    return;
                }
                cn.yscme.scrolling.auto.douyin.Response response = null;
                try {
                    response = cn.yscme.scrolling.auto.douyin.Response.parseFrom(bytes);
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException(e);
                }
                // 返回直播间服务器链接存活确认消息，便于持续获取数据
//                try {
//                    System.out.println(JsonFormat.printer().print(pushFrame));
//                } catch (InvalidProtocolBufferException e) {
//                    throw new RuntimeException(e);
//                }
                if (response.getNeedAck()) {
                    PushFrame  ack = PushFrame.newBuilder()
                            .setLogId(pushFrame.getLogId())
                            .setPayloadType("ack")
                            .setPayload(response.getInternalExtBytes())
                            .build();

                    try {
                        System.out.println(JsonFormat.printer().print(ack));
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e);
                    }
                    send(ack.toByteArray());
                }
            }

//�������:ackB\internal_src:pushserver|first_req_ms:1713605329493|wss_msg_type:r|wrds_v:7359880521343572467
            @Override
            public void onOpen(ServerHandshake serverHandshake) {
                System.out.println("WebSocket connected.");
                sendPing();
            }

            @Override
            public void onMessage(String s) {
                System.out.println(s);
            }

            @Override
            public void onClose(int i, String s, boolean b) {
                System.out.println(i+s);
            }

            @Override
            public void onError(Exception e) {
                System.out.println("WebSocket error: " + e.getMessage());
            }
        };
        // 添加 cookie 和 user-agent
        Map<String, String> headers = new HashMap<>();
        headers.put("Cookie", "your_cookie_value");
        headers.put("User-Agent", "your_user_agent");

        // 设置 WebSocket 握手请求的头部信息
        client.addHeader("cookie", getTtwid());
        client.addHeader("user-agent", userAgent);
        client.connect();
    }


    public static void main(String[] args) throws KeyManagementException, NoSuchAlgorithmException, URISyntaxException, InvalidProtocolBufferException {
        Test test=new Test("623513091128");
        test.connectWebSocket();
    }
}

