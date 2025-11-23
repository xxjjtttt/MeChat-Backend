package top.xxjjtt.chat.framework.idempotent.config;

import top.xxjjtt.chat.framework.idempotent.core.aop.IdempotentAspect;
import top.xxjjtt.chat.framework.idempotent.core.keyresolver.impl.DefaultIdempotentKeyResolver;
import top.xxjjtt.chat.framework.idempotent.core.keyresolver.impl.ExpressionIdempotentKeyResolver;
import top.xxjjtt.chat.framework.idempotent.core.keyresolver.IdempotentKeyResolver;
import top.xxjjtt.chat.framework.idempotent.core.keyresolver.impl.UserIdempotentKeyResolver;
import top.xxjjtt.chat.framework.idempotent.core.redis.IdempotentRedisDAO;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import top.xxjjtt.chat.framework.redis.config.ChatRedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;

@AutoConfiguration(after = ChatRedisAutoConfiguration.class)
public class ChatIdempotentConfiguration {

    @Bean
    public IdempotentAspect idempotentAspect(List<IdempotentKeyResolver> keyResolvers, IdempotentRedisDAO idempotentRedisDAO) {
        return new IdempotentAspect(keyResolvers, idempotentRedisDAO);
    }

    @Bean
    public IdempotentRedisDAO idempotentRedisDAO(StringRedisTemplate stringRedisTemplate) {
        return new IdempotentRedisDAO(stringRedisTemplate);
    }

    // ========== 各种 IdempotentKeyResolver Bean ==========

    @Bean
    public DefaultIdempotentKeyResolver defaultIdempotentKeyResolver() {
        return new DefaultIdempotentKeyResolver();
    }

    @Bean
    public UserIdempotentKeyResolver userIdempotentKeyResolver() {
        return new UserIdempotentKeyResolver();
    }

    @Bean
    public ExpressionIdempotentKeyResolver expressionIdempotentKeyResolver() {
        return new ExpressionIdempotentKeyResolver();
    }

}
