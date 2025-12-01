package top.xxjjtt.chat.server.controller.conversation;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.xxjjtt.chat.framework.common.pojo.CommonResult;
import top.xxjjtt.chat.server.controller.conversation.vo.ConversationStartReqVO;
import top.xxjjtt.chat.server.controller.conversation.vo.ConversationStartRespVO;
import top.xxjjtt.chat.server.service.conversation.ConversationService;

@RestController
@RequestMapping("/conversation")
@RequiredArgsConstructor
public class ConversationController {

    private final ConversationService conversationService;

    @PostMapping
    @Operation(summary = "开始会话", description = "开始会话并拿到会话信息，如果没有会话则创建，有会话则直接拿到会话ID")
    public CommonResult<ConversationStartRespVO> startConversation(@RequestBody ConversationStartReqVO reqVO) {
        return CommonResult.success(conversationService.startConversation(reqVO));
    }
}
