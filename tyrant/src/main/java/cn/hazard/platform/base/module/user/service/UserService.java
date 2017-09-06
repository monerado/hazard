package cn.hazard.platform.base.module.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.hazard.platform.base.module.user.dao.UserDAO;
import cn.hazard.platform.base.module.user.dao.entity.User;
import cn.hazard.zero.base.service.BaseService;

/**
 * 用户业务逻辑接口
 * @author ChenG
 * @param <T>
 * @param <T>
 */
@Transactional
public interface UserService extends BaseService<UserDAO, User> {

} // end interface UserService
