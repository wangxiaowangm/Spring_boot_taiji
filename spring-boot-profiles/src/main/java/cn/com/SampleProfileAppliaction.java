package cn.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.service.HelloService;

@SpringBootApplication
@RestController
public class SampleProfileAppliaction implements CommandLineRunner{

	@Autowired 
	private HelloService hellowang;
	
	@RequestMapping("/helloService")
	public void hello() {
		System.out.println(hellowang.message());
	}

	public void run(String... args) throws Exception {
		System.out.println(this.hellowang.message());

	}

	public static void main(String[] args) {
		SpringApplication.run(SampleProfileAppliaction.class, args);
	}

}
