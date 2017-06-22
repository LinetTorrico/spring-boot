package com.dh.project.demoLynn;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoLynnApplication {
	@RequestMapping("/")
	String home (){
		return "Hello lynn lynn";
	}
	public static void main(String[] args) {

		SpringApplication.run(DemoLynnApplication.class, args);
	}
}
