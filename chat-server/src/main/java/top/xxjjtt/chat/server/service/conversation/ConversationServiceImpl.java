package top.xxjjtt.chat.server.service.conversation;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.xxjjtt.chat.server.controller.conversation.vo.ConversationStartReqVO;
import top.xxjjtt.chat.server.controller.conversation.vo.ConversationStartRespVO;
import top.xxjjtt.chat.server.dal.dataobject.conversation.Conversation;
import top.xxjjtt.chat.server.dal.mysql.conversation.ConversationMapper;

@Service
public class ConversationServiceImpl extends ServiceImpl<ConversationMapper, Conversation> implements ConversationService {

    @Override
    @Transactional
    public ConversationStartRespVO startConversation(ConversationStartReqVO reqVO) {
        //
        return null;
    }
}
