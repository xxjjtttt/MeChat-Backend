package top.xxjjtt.chat.server.dal.dataobject.group;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import top.xxjjtt.chat.framework.mybatis.core.dataobject.BaseDO;

@Data
@TableName("server_group")
@KeySequence("server_group_seq")
public class Group extends BaseDO {

    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 群组名
     */
    private String name;

    /**
     * 群组头像
     */
    private String avatar;

    /**
     * 群组公告
     */
    private String announcement;

    /**
     * 最大群成员
     */
    private Integer maxMember;
}
