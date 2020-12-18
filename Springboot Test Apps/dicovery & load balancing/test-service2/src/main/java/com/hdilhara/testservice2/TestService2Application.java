package com.hdilhara.testservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@Controller
public class TestService2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestService2Application.class, args);
	}

	@RequestMapping("/home")
	public String homeMapping(){
		System.out.println("Service 2");
		return "home";
	}
}
