package top.xxjjtt.chat.server.dal.mysql.friend;

import org.apache.ibatis.annotations.Mapper;
import top.xxjjtt.chat.framework.mybatis.core.mapper.BaseMapperX;
import top.xxjjtt.chat.server.dal.dataobject.friend.Friend;

@Mapper
public interface FriendMapper extends BaseMapperX<Friend> {

}
