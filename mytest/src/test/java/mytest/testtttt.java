package mytest;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import com.xxy.bbs.bean.User;
import com.xxy.bbs.service.UserService;


@Test
@ContextConfiguration(locations = { "classpath:applicationContext-common.xml"})
// 加载spring 配置文件
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@TestExecutionListeners({ TransactionalTestExecutionListener.class,
		DependencyInjectionTestExecutionListener.class })
@Transactional
public class testtttt extends AbstractTransactionalTestNGSpringContextTests {
	
	@Resource
	private UserService userService;
	
	public void usertest(){
		User user  = new User();
		user.setId(2);
		user.setName("中国人ss");
		user.setNikename("好fsdfsf");
		user.setSex("2");
		userService.insert(user);
	}
	public void getUser(){
		User user = userService.selectByPrimaryKey(1);
		System.out.println(user.getName());
	}
	
}