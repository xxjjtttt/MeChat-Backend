package top.xxjjtt.chat.server.netty;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Data
@Validated
@Configuration
@ConfigurationProperties(prefix = "chat.netty")
public class NettyProperties {

    /**
     * netty服务端口号
     */
    @NotNull(message = "netty端口号不能为空")
    private Integer port;

    /**
     * netty服务前缀
     */
    @NotEmpty(message = "netty服务前缀不能为空")
    private String prefix;

}
