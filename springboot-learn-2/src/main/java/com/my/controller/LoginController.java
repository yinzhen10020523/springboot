package com.my.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/sayHello")
	public String login(){
		
		return "hello xiaonuo";
	}
	
}
