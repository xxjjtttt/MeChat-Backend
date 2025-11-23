package top.xxjjtt.chat.server.service.friend;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.xxjjtt.chat.server.dal.dataobject.friend.Friend;
import top.xxjjtt.chat.server.dal.mysql.friend.FriendMapper;

@Service
public class FriendServiceImpl extends ServiceImpl<FriendMapper, Friend> implements FriendService {

}