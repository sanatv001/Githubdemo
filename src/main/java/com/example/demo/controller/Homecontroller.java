package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	
	@RequestMapping("/home")
	public String homecontroll() {
		String str="Welcome to home";
		str=str.toLowerCase();
		str=str.toUpperCase();
		return str;
	}
}
