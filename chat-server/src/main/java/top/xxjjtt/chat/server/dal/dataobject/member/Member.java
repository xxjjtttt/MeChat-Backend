package top.xxjjtt.chat.server.dal.dataobject.member;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import top.xxjjtt.chat.framework.tenant.core.db.TenantBaseDO;
import top.xxjjtt.chat.server.enums.member.MemberTypeEnum;

@Data
@TableName("conversation_member")
public class Member extends TenantBaseDO {

    @TableId
    private Long id;

    /**
     * 会话ID
     */
    private Long conversationId;

    /**
     * 会话成员ID
     */
    private Long memberId;

    /**
     * 成员类型
     * @see MemberTypeEnum
     */
    private Integer type;
}
