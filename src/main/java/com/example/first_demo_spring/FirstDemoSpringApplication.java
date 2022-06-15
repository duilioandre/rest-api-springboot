package com.example.first_demo_spring;

import com.example.first_demo_spring.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FirstDemoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstDemoSpringApplication.class, args);
	}

}
