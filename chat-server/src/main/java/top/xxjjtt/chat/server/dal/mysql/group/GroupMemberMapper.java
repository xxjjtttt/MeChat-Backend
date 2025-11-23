package top.xxjjtt.chat.server.dal.mysql.group;

import org.apache.ibatis.annotations.Mapper;
import top.xxjjtt.chat.framework.mybatis.core.mapper.BaseMapperX;
import top.xxjjtt.chat.server.dal.dataobject.group.GroupMember;

@Mapper
public interface GroupMemberMapper extends BaseMapperX<GroupMember> {

}
