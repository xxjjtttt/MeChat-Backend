package top.xxjjtt.chat.server.dal.mysql.request;

import org.apache.ibatis.annotations.Mapper;
import top.xxjjtt.chat.framework.mybatis.core.mapper.BaseMapperX;
import top.xxjjtt.chat.server.dal.dataobject.request.Request;

@Mapper
public interface RequestMapper extends BaseMapperX<Request> {

}
