package com.example.first_demo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstDemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstDemoSpringApplication.class, args);
	}

}
