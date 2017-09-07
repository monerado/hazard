package cn.hazard.platform.base.test.module.user;

import org.apache.log4j.Logger;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hazard.platform.base.test.BaseTest;

/**
 * 用户单元测试
 * @author ChenG
 */
@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ControllerTest extends BaseTest {

	/**
	 * 日志
	 */
	@SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(ControllerTest.class);

	/**
	 * 跳转登录页面
	 * @throws Exception
	 */
	@Test
	public void testA_Index() throws Exception {
//		User user = new User();
//		List<User> users = this.userService.findList(user);
//		Random random = new Random();
//		random.setSeed(System.currentTimeMillis());
//		String responseString = null;
//		responseString = this.mockMvc.perform(MockMvcRequestBuilders.post("/building/initAdd").param("currentUserPK", users.get(random.nextInt(users.size())).getPkid()))
//			.andDo(print()).andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
//		this.logger.info(responseString);
	} // end method testA_Index 

	/**
	 * 注册用户
	 * @throws Exception
	 */
	@Test
	public void testB_Register() throws Exception {
//		Building parameter = new Building();
//		String [] titles = new String [] {"随身厅", "家庭V网"};
//		User user = new User();
//		List<User> users = this.userService.findList(user);
//		Random random = new Random();
//		random.setSeed(System.currentTimeMillis());
//		parameter.setTitle(titles[random.nextInt(2)]);
//		parameter.setDescribe(titles[random.nextInt(2)] + "的描述");
//		parameter.setAdministrators(users.get(random.nextInt(users.size())).getPkid());
//		parameter.setAuditor(users.get(random.nextInt(users.size())).getPkid());
//
//		parameter.setProcessStatus("0");
//		parameter.setCreateBy("1");
//		Gson gson = new Gson();
//		String requestJson = gson.toJson(parameter);
//		this.logger.info(requestJson);
//		String responseString = null;
//		responseString = this.mockMvc.perform(MockMvcRequestBuilders.post("/building/add").param("building", requestJson))
//			.andDo(print()).andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
//		this.logger.info(responseString);
	} // end method testB_Register 

	/**
	 * 登录
	 * @throws Exception
	 */
	@Test
	public void testC_SignIn() throws Exception {

	} // end method testC_SignIn 

	/**
	 * 跳转首页
	 * @throws Exception
	 */
	@Test
	public void testD_Home() throws Exception {

	} // end method testD_Home 
	
	/**
	 * 登出
	 * @throws Exception
	 */
	@Test
	public void testE_SignOut() throws Exception {
		
	} // end method testE_SignOut 
	
	/**
	 * 验证数据是否重复
	 * 账号
	 * 邮箱
	 * 手机号
	 * 身份证号码
	 * @throws Exception
	 */
	@Test
	public void testF_VerifyRepetition() throws Exception {
		
	} // end method testF_VerifyRepetition 

} // end classs ControllerTest 
