package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("test/hello")
	public String hello(){
		return "Springboot hello to Gitlab CI";
	}

	@GetMapping("test/")
	public String hi(){
		return "Springboot hello to Gitlab CI";
	}

	@GetMapping("test/")
	public String sayHi(){
		return "Springboot hello to Gitlab CI";
	}
}
