package com.example.teju.tutorial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "hello world!";
	}
	
	@RequestMapping("/hello")
	public String helloUser() {
		return "hello user!";
	}
}
