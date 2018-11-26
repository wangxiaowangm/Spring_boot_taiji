package cn.com.taiji.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SimpleConfigration {

	@Bean
	@Primary
	public User user() {
		User user = new User();
		user.setAge(10);
		user.setName("tom");
		return user;
	}
}
