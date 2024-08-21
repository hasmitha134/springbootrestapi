package com.example.springbootrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/user")
	public String User() {
		return userservice.getUser();
	}
	@RequestMapping("/create")
	public String createUser() {
		return userservice.senduser();
	}
	
	

}
 