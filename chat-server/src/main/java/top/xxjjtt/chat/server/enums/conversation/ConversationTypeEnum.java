package top.xxjjtt.chat.server.enums.conversation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConversationTypeEnum {

    P2P(1), // 单聊
    GROUP(2), // 群组
    EXTERNAL_P2P(3), // 外部单聊
    EXTERNAL_GROUP(4); // 外部群组

    /**
     * 类型
     */
    private final Integer type;

}
