package top.xxjjtt.chat.server.controller.friend.vo;

import lombok.Data;
import top.xxjjtt.chat.framework.common.pojo.PageParam;

@Data
public class FriendPageReqVO extends PageParam {

    /**
     * 是否标星
     */
    private Boolean starred;

    /**
     * 是否置顶
     */
    private Boolean pinned;

    /**
     * 是否拉黑
     */
    private Boolean blocked;

}
