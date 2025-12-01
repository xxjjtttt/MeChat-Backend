package top.xxjjtt.chat.server.dal.mysql.member;

import org.apache.ibatis.annotations.Mapper;
import top.xxjjtt.chat.framework.mybatis.core.mapper.BaseMapperX;
import top.xxjjtt.chat.server.dal.dataobject.member.Member;

@Mapper
public interface MemberMapper extends BaseMapperX<Member> {

}
