package com.firstproj.RESTAPI.controller.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.firstproj.RESTAPI.entity.Users;
import com.firstproj.RESTAPI.repository.UserRepository;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/user")
public class UserController {
	//post store user in DB
	@PostMapping("/register")
	
	public void createrUser(@RequestBody Users users) {
		Users save = new Users();
		
	}

}
