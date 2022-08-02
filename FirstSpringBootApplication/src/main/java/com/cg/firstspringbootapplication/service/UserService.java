package com.cg.firstspringbootapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.firstspringbootapplication.model.User;

@Service
public class UserService {
	
	
	public User getUser() {
		User user = new User("23","Nik", "25", "nik199@gmail.com", "8989898989");
		return user;
		
	}
	
	public List<User> getUsers() {
		User user = new User("23","Nik", "25", "nik199@gmail.com", "8989898989");
		User user1 = new User("24","Rohit", "25", "rohit199@gmail.com", "8989898990");
		List<User> users = new ArrayList<>();
		users.add(user);
		users.add(user1);
		return users;
		
	}

}
