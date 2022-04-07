package com.example.springDemo2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemo2021Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo2021Application.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello World";
	}

}
