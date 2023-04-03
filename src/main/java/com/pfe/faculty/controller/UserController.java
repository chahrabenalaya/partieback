package com.pfe.faculty.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.faculty.entities.User;
import com.pfe.faculty.service.UserService;

@RestController 
@RequestMapping("/api/v1/users")
public class UserController {
	
	
	private UserService userService;
	
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user ) {
		
		//System.out.println(user);
		
		return userService.createUser(user);
		
	}
}
