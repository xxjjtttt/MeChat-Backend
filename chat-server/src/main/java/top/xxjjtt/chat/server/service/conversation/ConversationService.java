package top.xxjjtt.chat.server.service.conversation;

import com.baomidou.mybatisplus.extension.service.IService;
import top.xxjjtt.chat.server.controller.conversation.vo.ConversationStartReqVO;
import top.xxjjtt.chat.server.controller.conversation.vo.ConversationStartRespVO;
import top.xxjjtt.chat.server.dal.dataobject.conversation.Conversation;

public interface ConversationService extends IService<Conversation> {

    ConversationStartRespVO startConversation(ConversationStartReqVO reqVO);
}
