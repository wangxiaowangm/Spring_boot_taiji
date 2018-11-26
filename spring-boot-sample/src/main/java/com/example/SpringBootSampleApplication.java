package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.HelloBean;

@SpringBootApplication
@RestController
public class SpringBootSampleApplication {
	
	@Value("${name}")
	private String name;

	@RequestMapping("/hello")
	public String hello() {
		return "hello,world!"+name;
	}
	
	@Autowired
    private HelloBean helloBean;
    
	@RequestMapping("/hellobean")
	public String hellobean() {
		return helloBean.toString();
		
	}
	
	@Bean
	public static CommandLineRunner testA() {
		CommandLineRunner runner = new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("The testA runner start to init...");
				
			}
		};
		return runner;
	}

	
	
	public static void main(String[] args) {
	
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}
}
