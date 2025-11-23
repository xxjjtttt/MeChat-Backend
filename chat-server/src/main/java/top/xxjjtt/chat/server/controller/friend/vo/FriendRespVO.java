package top.xxjjtt.chat.server.controller.friend.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class FriendRespVO {

    /**
     * 主键
     */
    @TableId
    private Long id;

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
