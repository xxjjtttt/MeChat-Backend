package top.xxjjtt.chat.server.dal.dataobject.message;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import top.xxjjtt.chat.framework.tenant.core.db.TenantBaseDO;

@Data
@TableName("conversation_message")
public class Message extends TenantBaseDO {

    @TableId
    private Long id;

    /**
     * 会话ID
     */
    private Long conversationId;

    /**
     * 发送者ID
     */
    private Long senderId;

    /**
     * 内容 JSON格式
     */
    private String content;

    /**
     * 引用消息ID
     */
    private Long quote;

    /**
     * 消息状态
     * @see
     */
    private Integer status;
}
