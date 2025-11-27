package top.xxjjtt.chat.server.netty.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 空闲检测
 */
@Slf4j
@Component
@ChannelHandler.Sharable
public class IdleStateHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            ctx.channel().close();
            log.warn("客户端 {} 超时未读写，强制下线", ctx.channel().id());
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }
}