package com.hdilhara.testservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaClient
@Controller
public class TestService1Application {

	public static void main(String[] args) {
		SpringApplication.run(TestService1Application.class, args);
	}

	@RequestMapping("/home")
	public String homeRoute(){
		System.out.println("Test Server 1");
		return "home";
	}

}
