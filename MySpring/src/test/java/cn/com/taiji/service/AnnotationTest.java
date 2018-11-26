package cn.com.taiji.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.taiji.bean.AnotherBean;
import cn.com.taiji.bean.ExampleBean;
import cn.com.taiji.bean.SimpleConfigration;
import cn.com.taiji.bean.User;
import cn.com.taji.service.HelloWorldService;

public class AnnotationTest {
	private AnnotationConfigApplicationContext context;

	@Before
	public void initialContext() {
		context = new AnnotationConfigApplicationContext(SimpleConfigration.class);
		context.scan("cn.com.taiji");
		// context.refresh();
		context.registerShutdownHook();

		int count = context.getBeanDefinitionCount();
		System.out.println("BeanµÄ¸öÊý" + count);
		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name + "-->");
			Object bean = context.getBean(name);
			System.out.println(bean.getClass());
		}
	}

	// @Test
	// public void testHelloService() {
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("annotation.xml");
	// context.getBean("helloWorldService", HelloWorldService.class).sayHello();
	// }
	//
	// @Test
	// public void testExampleBean() {
	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("annotation.xml");
	// context.getBean(ExampleBean.class);
	// }

	@Test
	public void testUser() {
		User user = context.getBean(User.class);
		System.out.println(user);
	}
}
