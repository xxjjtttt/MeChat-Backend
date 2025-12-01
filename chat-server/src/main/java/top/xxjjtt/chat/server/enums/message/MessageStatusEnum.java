package top.xxjjtt.chat.server.enums.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageStatusEnum {

    SENDING(1), // 发送中
    SENT(2), // 已发送
    FAILED(3), // 发送失败
    RECALLED(4), // 已撤回
    EDITED(5); // 已编辑

    private final Integer status;
}
