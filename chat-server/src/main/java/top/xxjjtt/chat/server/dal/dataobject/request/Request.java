package top.xxjjtt.chat.server.dal.dataobject.request;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import top.xxjjtt.chat.framework.mybatis.core.dataobject.BaseDO;

@Data
@TableName("server_request")
@KeySequence("server_request_seq")
public class Request extends BaseDO {

    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 申请类型
     */
    private Integer type;

    /**
     * 发起人ID
     */
    private Long ownerId;

    /**
     * 申请附言
     */
    private String message;

    /**
     * 申请状态
     */
    private Integer status;

    /**
     * 审核人ID
     */
    private Long auditorId;

}
