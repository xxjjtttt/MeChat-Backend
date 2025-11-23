package top.xxjjtt.chat.server.controller.friend;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xxjjtt.chat.framework.common.pojo.CommonResult;
import top.xxjjtt.chat.framework.common.pojo.PageResult;
import top.xxjjtt.chat.server.controller.friend.vo.FriendPageReqVO;
import top.xxjjtt.chat.server.controller.friend.vo.FriendRespVO;
import top.xxjjtt.chat.server.service.friend.FriendService;

@RestController
@RequestMapping("/friend")
@RequiredArgsConstructor
public class FriendController {

    private final FriendService friendService;

    @GetMapping("/page")
    @Operation(summary = "获得好友分页列表")
    @PreAuthorize("@ss.hasPermission('server:friend:query')")
    public CommonResult<PageResult<FriendRespVO>> pageFriend(@Valid FriendPageReqVO pageReqVO) {

        return CommonResult.success(null);
    }

}
