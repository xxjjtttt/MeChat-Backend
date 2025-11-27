package top.xxjjtt.chat.server.netty.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 心跳响应
 */
@Slf4j
@Component
@ChannelHandler.Sharable
public class HeartBeatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    private static final String PING = "PING";
    private static final String PONG = "PONG";

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) {
        String text = msg.text();
        if (PING.equalsIgnoreCase(text.trim())) {
            ctx.writeAndFlush(new TextWebSocketFrame(PONG));
            return;
        }
        // 不是心跳，继续往下传
        ctx.fireChannelRead(msg);
    }
}