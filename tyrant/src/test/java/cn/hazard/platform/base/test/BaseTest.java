package cn.hazard.platform.base.test;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 单元测试基类
 * @author 董天明
 */
@WebAppConfiguration(value = "src/main/webapp")
@ContextHierarchy({ 
@ContextConfiguration(name = "parent", locations = "classpath*:spring-context.xml"),
@ContextConfiguration(name = "child", locations = "classpath*:spring-mvc.xml") })
public abstract class BaseTest {

	/**
	 * 
	 */
	@Autowired
	protected WebApplicationContext wac;

	/**
	 * 
	 */
	protected MockMvc mockMvc;
	
	@Before
	public void init() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	} // end method init 

} // end abstract class BaseTest 
