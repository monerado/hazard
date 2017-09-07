/**
 * 
 */
package cn.hazard.platform.base.module.user.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hazard.platform.base.module.user.service.UserService;
import cn.hazard.zero.base.web.BaseController;

/**
 * 用户视图控制器
 * @author ChenG
 */
@Controller
public class UserController<E> extends BaseController<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2626022507587924121L;

	/**
	 * 日志
	 */
	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(UserController.class);

	/**
	 * 用户业务逻辑
	 */
	@Autowired
	@Qualifier("baseUserService")
	private UserService userService;

	/**
	 * 登录接口
	 * @param account
	 * @param password
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 */
	@RequestMapping(value = "/system/login", method = RequestMethod.POST)
	@ResponseBody
	public void login(@RequestParam(value = "parameter") String parameter, HttpServletRequest request, HttpServletResponse response) {

//		Subject currentUser = SecurityUtils.getSubject();
//		this.logger.info(new Md5Hash(password, account, 1).toString());
//		UsernamePasswordToken token = new UsernamePasswordToken(account, new Md5Hash(password, account, 1).toString());
//		token.setRememberMe(true);
//		try {
//			currentUser.login(token);
//		} catch (UnknownAccountException e) {
//			this.logger.info("账号不存在");
//		} catch (IncorrectCredentialsException e) {
//			this.logger.info("密码不正确");
//		} catch (LockedAccountException e) {
//			this.logger.info("账户被锁定");			
//		} catch (AuthenticationException e) {
//			this.logger.info("认证异常");
//			e.printStackTrace();
//		} // end try/catch block 
//
//		AjaxResult message = new AjaxResult();
//		if(currentUser.isAuthenticated()) {
//			currentUser.getSession().setAttribute("user", currentUser);
//			message.setStatus("0");
//			message.setMessage("登陆成功!");
//			SimplePrincipalCollection principals = (SimplePrincipalCollection) currentUser.getPrincipals();
//			User user = (User) principals.asList().get(1);
//			message.setData(user);
//		} else {
//			message.setStatus("10012");
//			message.setMessage("登录失败!");
//		} // end if/else block 
//
//		AjaxResult.print(response, message);
	} // end method login 

	/**
	 * 验证session中是否有登陆中的用户
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 */
	@RequestMapping(value = "/system/verifyLogin")
	@ResponseBody
	public void verifyLogin(HttpServletRequest request, HttpServletResponse response){
//		AjaxResult ajaxResult = new AjaxResult();
//		if(null == Application.getCurrentUser()) {
//			ajaxResult.setSuccess(true);
//			ajaxResult.setMessage("html/biz/sytem/login.html");
//		} else {
//			ajaxResult.setStatus("0");
//			ajaxResult.setMessage("验证成功!");
//			ajaxResult.setData(Application.getCurrentUser());
//		} // end if/else block 
//		AjaxResult.print(response, ajaxResult);
	} // end method verifyLogin 

	/**
	 * 退出登录
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 */
	@RequestMapping(value="/system/logout")
	@ResponseBody
	public void logout(HttpServletRequest request, HttpServletResponse response) {
//		Application.removeStorage();
//		AjaxResult ajaxResult = new AjaxResult();
//		ajaxResult.setStatus("0");
//		AjaxResult.print(response, ajaxResult);
	} // end method logout 

} // end class UserController
