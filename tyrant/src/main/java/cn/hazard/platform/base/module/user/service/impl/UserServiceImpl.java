package cn.hazard.platform.base.module.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hazard.platform.base.module.user.dao.UserDAO;
import cn.hazard.platform.base.module.user.dao.entity.User;
import cn.hazard.platform.base.module.user.service.UserService;
import cn.hazard.zero.base.service.impl.BaseServiceImpl;

/**
 * 用户业务逻辑
 * @author ChenG
 */
@Service("baseUserService")
public class UserServiceImpl extends BaseServiceImpl<UserDAO, User> implements UserService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8739280752504167897L;

	/**
	 * 用户持久化
	 */
	@SuppressWarnings("unused")
	@Autowired
	private UserDAO userDAO;

} // end class UserService
