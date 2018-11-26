package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@ConfigurationProperties(prefix="my")
@Configuration
@Data

public class HelloBean {
	private String secret;
	private String number;
	private String bignumber;
	
}
