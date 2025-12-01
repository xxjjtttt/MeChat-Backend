package top.xxjjtt.chat.server.dal.dataobject.conversation;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import top.xxjjtt.chat.framework.tenant.core.db.TenantBaseDO;
import top.xxjjtt.chat.server.enums.conversation.ConversationTypeEnum;

@Data
@TableName("conversation")
public class Conversation extends TenantBaseDO {

    @TableId
    private Long id;

    /**
     * 会话类型
     * @see ConversationTypeEnum
     */
    private Integer type;

    /**
     * 会话名
     */
    private String name;

    /**
     * 会话头像
     */
    private String avatar;

    /**
     * 会话群主
     */
    private Long ownerId;

    /**
     * 会话额外信息 JSON
     */
    private String extraInformation;
}
