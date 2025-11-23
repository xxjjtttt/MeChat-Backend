package top.xxjjtt.chat.server.dal.dataobject.group;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import top.xxjjtt.chat.framework.mybatis.core.dataobject.BaseDO;

@Data
@TableName("server_group_member")
@KeySequence("server_group_member_seq")
public class GroupMember extends BaseDO {

    /**
     * 主键
     */
    @TableId
    private Long id;

    /**
     * 群组ID
     */
    private Long groupId;

    /**
     * 成员ID
     */
    private Long memberId;

    /**
     * 群昵称
     */
    private String nickname;
}
