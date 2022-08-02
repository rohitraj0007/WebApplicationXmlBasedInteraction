package com.cg.firstspringbootapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.firstspringbootapplication.model.User;
import com.cg.firstspringbootapplication.service.UserService;

@RestController
@RequestMapping(path = "/xml-output",
produces = "application/xml")
public class Hellocontroller {

	@Autowired
	UserService userService;
	@GetMapping
	public String printMessage(){
		return "try and Try until you reach your goal";
	}
	@GetMapping("/users")
	public List<User> getUsers(){
		return userService.getUsers();
		
	}
	@GetMapping("/user")
	public User getUser(){
		return userService.getUser();
		
	}
	
}
