package cn.yscme.scrolling;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
public class DouyinLiveWebFetcher {

    private String liveId;
    private String ttwid;
    private String roomId;
    private OkHttpClient client;
    private WebSocket ws;

    public DouyinLiveWebFetcher(String liveId) {
        this.liveId = liveId;
        this.client = new OkHttpClient();
    }

    public void start() {
        // 开始连接 WebSocket
        connectWebSocket();
    }

    public void stop() {
        // 关闭 WebSocket 连接
        if (ws != null) {
            ws.close(1000, null);
        }
    }

    // 生成随机字符串作为 msToken
    private String generateMsToken(int length) {
        StringBuilder randomStr = new StringBuilder();
        String baseStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789=_";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomStr.append(baseStr.charAt(random.nextInt(baseStr.length())));
        }
        return randomStr.toString();
    }

    // 获取 ttwid
    private String generateTtwid() throws IOException {
        Request request = new Request.Builder()
                .url("https://live.douyin.com/")
                .build();
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return response.header("Set-Cookie").split(";")[0];
        }
    }

    // 获取直播间的 roomId
    private String fetchRoomId() throws IOException {
        String cookie = generateTtwid();
        ttwid=cookie;
        Request request = new Request.Builder()
                .url("https://live.douyin.com/" + liveId)
                .header("Cookie", cookie + ";msToken=" + generateMsToken(107)+"; __ac_nonce=0123407cc00a9e438deb4")
                .build();
        try (Response response = client.newCall(request).execute()) {
            String body=response.body().string();
            System.out.println(body);
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            Pattern pattern = Pattern.compile(",\\\\\"roomId\\\\\":\\\\\"(\\d+)\\\\\",");
            Matcher matcher = pattern.matcher(body);
            if (matcher.find()) {
                return matcher.group(1);
            } else {
                throw new IOException("No match found for roomId");
            }
        }
    }

    // 连接 WebSocket
    private void connectWebSocket() {
        // WebSocket URL
        String url = "wss://webcast3-ws-web-lq.douyin.com/webcast/im/push/v2/?" +
                        "app_name=douyin_web&version_code=180800&webcast_sdk_version=1.3.0&update_version_code=1.3.0&compress=gzip" +
                        "&internal_ext=internal_src:dim|wss_push_room_id:"+roomId
                        +"|wss_push_did:"+roomId
                        +"|dim_log_id:202302171547011A160A7BAA76660E13ED|fetch_time:1676620021641|seq:1|wss_info:0-1676" +
                        "620021641-0-0|wrds_kvs:WebcastRoomStatsMessage-1676620020691146024_WebcastRoomRankMessage-167661" +
                        "9972726895075_AudienceGiftSyncData-1676619980834317696_HighlightContainerSyncData-2&cursor=t-1676620021641_r-1_d-1_u-1_h-1" +
                        "&host=https://live.douyin.com&aid=6383&live_id=1&did_rule=3&debug=false&endpoint=live_pc&support_wrds=1&" +
                        "im_path=/webcast/im/fetch/&user_unique_id="+roomId
                        +"&device_platform=web&cookie_enabled=true&screen_width=1440&screen_height=900&browser_language=zh&browser_platform=MacIntel&browser_name=Mozilla&" +
                        "browser_version=5.0%%20(Macintosh;%20Intel%%20Mac%%20OS%%20X%%2010_15_7)%%20AppleWebKit/537.36%%20(KHTML,%%20like%%20Gecko)%%20Chrome/110.0.0.0%%20Safari/537.36&" +
                        "browser_online=true&tz_name=Asia/Shanghai&identity=audience&" +
                        "room_id="+roomId+"&heartbeatDuration=0&signature=00000000";
        System.err.println(url);
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Cookie", "ttwid=" + ttwid)
                .build();
        WebSocketListener listener = new WebSocketListener() {
            @Override
            public void onOpen(WebSocket webSocket, Response response) {
                System.out.println("WebSocket connected.");
            }

            @Override
            public void onMessage(WebSocket webSocket, String text) {
                System.out.println("Received message: " + text);
            }

            @Override
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                t.printStackTrace();
            }
        };
        ws = client.newWebSocket(request, listener);
    }

    public static void main(String[] args) throws IOException {
        // 创建 cn.yscme.scrolling.DouyinLiveWebFetcher 实例并开始连接
        DouyinLiveWebFetcher fetcher = new DouyinLiveWebFetcher("623513091128"); // Replace with your live ID
        fetcher.roomId=fetcher.fetchRoomId();
        fetcher.start();
//        fetcher.connectWebSocket();
    }
}
