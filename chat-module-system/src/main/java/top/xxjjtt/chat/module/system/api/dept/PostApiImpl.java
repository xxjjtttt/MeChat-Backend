package top.xxjjtt.chat.module.system.api.dept;

import top.xxjjtt.chat.framework.common.util.object.BeanUtils;
import top.xxjjtt.chat.module.system.api.dept.dto.PostRespDTO;
import top.xxjjtt.chat.module.system.dal.dataobject.dept.PostDO;
import top.xxjjtt.chat.module.system.service.dept.PostService;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * 岗位 API 实现类
 *
 * @author 芋道源码
 */
@Service
public class PostApiImpl implements PostApi {

    @Resource
    private PostService postService;

    @Override
    public void validPostList(Collection<Long> ids) {
        postService.validatePostList(ids);
    }

    @Override
    public List<PostRespDTO> getPostList(Collection<Long> ids) {
        List<PostDO> list = postService.getPostList(ids);
        return BeanUtils.toBean(list, PostRespDTO.class);
    }

}
