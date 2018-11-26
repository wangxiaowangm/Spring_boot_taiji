package cn.com.taji.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	@Value("aaa")
	private String name;

	public HelloWorldService() {

	}

	public HelloWorldService(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("hello" + this.name);
	}
}
