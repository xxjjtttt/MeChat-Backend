package top.xxjjtt.chat.server.enums.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberTypeEnum {

    OWNER(1), // 群主
    MANAGER(2), // 管理员
    MEMBER(3); // 成员

    private final Integer type;
}
