package top.xxjjtt.chat.server.dal.mysql.message;

import org.apache.ibatis.annotations.Mapper;
import top.xxjjtt.chat.framework.mybatis.core.mapper.BaseMapperX;
import top.xxjjtt.chat.server.dal.dataobject.message.Message;

@Mapper
public interface MessageMapper extends BaseMapperX<Message> {

}
