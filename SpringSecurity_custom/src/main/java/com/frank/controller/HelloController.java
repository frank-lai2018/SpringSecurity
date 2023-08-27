package com.frank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/index")
	public String index() {
		System.out.println("indexindex");
		return "hello index";
	}
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hellohellohello");
		return "hello hello hello";
	}
}
