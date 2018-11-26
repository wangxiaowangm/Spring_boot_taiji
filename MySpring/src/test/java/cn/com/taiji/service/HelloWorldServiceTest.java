package cn.com.taiji.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.com.taji.service.HelloWorldService;

public class HelloWorldServiceTest {

	@Test
	public void helloWorldServiceTest() {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		// ApplicationContext context = new
		// FileSystemXmlApplicationContext("classpath:annotation.xml");
		int count = context.getBeanDefinitionCount();
		System.out.println(count);
		context.getBean(HelloWorldService.class).sayHello();
	}
}
