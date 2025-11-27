package top.xxjjtt.chat.server.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import top.xxjjtt.chat.server.netty.config.NettyProperties;
import top.xxjjtt.chat.server.netty.handler.ExceptionHandler;
import top.xxjjtt.chat.server.netty.handler.HeartBeatHandler;
import top.xxjjtt.chat.server.netty.handler.IdleStateHandler;
import top.xxjjtt.chat.server.netty.handler.ChatBizHandler;

import java.util.concurrent.TimeUnit;

@Component
@RequiredArgsConstructor
public class NettyChannelInitializer extends ChannelInitializer<SocketChannel> {

    private final NettyProperties nettyProperties;
    private final ChatBizHandler chatBizHandler;
    private final IdleStateHandler idleStateHandler;
    private final HeartBeatHandler heartBeatHandler;
    private final ExceptionHandler exceptionHandler;

    @Override
    protected void initChannel(SocketChannel channel) {
        ChannelPipeline pipeline = channel.pipeline();
        // 将 HTTP 请求/响应编解码为 FullHttpRequest / FullHttpResponse
        pipeline.addLast(new HttpServerCodec());
        // 将多个 HttpMessage 合并成一个完整的 FullHttpRequest/FullHttpResponse
        pipeline.addLast(new HttpObjectAggregator(65536));
        // 负责 WebSocket 握手（Upgrade 流程）以及控制帧（Close、Ping、Pong）的处理
        // 参数为 WebSocket 的访问路径
        pipeline.addLast(new WebSocketServerProtocolHandler(nettyProperties.getPrefix()));
        // 空闲检测 30 秒内没有任何读或写操作就触发 IdleStateEvent
        pipeline.addLast(new io.netty.handler.timeout.IdleStateHandler(30, 30, 0, TimeUnit.SECONDS));
        // 监听 IdleStateEvent，超时后自动关闭连接（防僵死客户端）
        pipeline.addLast(idleStateHandler);
        // 处理客户端主动发送的 Ping 帧并回复 Pong（大部分浏览器会自动发）
        pipeline.addLast(heartBeatHandler);
        // 真正的业务逻辑
        pipeline.addLast(chatBizHandler);
        // 异常处理器
        pipeline.addLast(exceptionHandler);
    }
}
