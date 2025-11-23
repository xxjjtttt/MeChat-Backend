package top.xxjjtt.chat.server.dal.dataobject.friend;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import top.xxjjtt.chat.framework.mybatis.core.dataobject.BaseDO;

@Data
@TableName("server_friend")
@KeySequence("server_friend_seq")
public class Friend extends BaseDO {

    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 用户ID
     */
    private Long ownerId;

    /**
     * 朋友ID
     */
    private Long friendId;

    /**
     * 备注名
     */
    private String remark;

    /**
     * 是否标星
     */
    private Boolean starred;

    /**
     * 是否指定
     */
    private Boolean pinned;

    /**
     * 是否拉黑
     */
    private Boolean blocked;
}
