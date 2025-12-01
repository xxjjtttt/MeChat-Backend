package top.xxjjtt.chat.server.dal.mysql.conversation;

import org.apache.ibatis.annotations.Mapper;
import top.xxjjtt.chat.framework.mybatis.core.mapper.BaseMapperX;
import top.xxjjtt.chat.server.dal.dataobject.conversation.Conversation;

@Mapper
public interface ConversationMapper extends BaseMapperX<Conversation> {

}
