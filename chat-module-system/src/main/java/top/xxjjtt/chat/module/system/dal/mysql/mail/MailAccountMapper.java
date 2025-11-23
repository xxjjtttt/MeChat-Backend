package top.xxjjtt.chat.module.system.dal.mysql.mail;

import top.xxjjtt.chat.framework.common.pojo.PageResult;
import top.xxjjtt.chat.framework.mybatis.core.mapper.BaseMapperX;
import top.xxjjtt.chat.framework.mybatis.core.query.LambdaQueryWrapperX;
import top.xxjjtt.chat.module.system.controller.admin.mail.vo.account.MailAccountPageReqVO;
import top.xxjjtt.chat.module.system.dal.dataobject.mail.MailAccountDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MailAccountMapper extends BaseMapperX<MailAccountDO> {

    default PageResult<MailAccountDO> selectPage(MailAccountPageReqVO pageReqVO) {
        return selectPage(pageReqVO, new LambdaQueryWrapperX<MailAccountDO>()
                .likeIfPresent(MailAccountDO::getMail, pageReqVO.getMail())
                .likeIfPresent(MailAccountDO::getUsername , pageReqVO.getUsername())
                .orderByDesc(MailAccountDO::getId));
    }

}
