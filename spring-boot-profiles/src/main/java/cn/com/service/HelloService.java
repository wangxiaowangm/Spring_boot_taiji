package cn.com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("hello")
public class HelloService implements MessageService {

	@Value("${name:world}")
	private String name;

	@Override
	public String message() {

		return "hello" + this.name;
	}

}
