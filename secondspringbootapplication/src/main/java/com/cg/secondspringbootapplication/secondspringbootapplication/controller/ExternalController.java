package com.cg.secondspringbootapplication.secondspringbootapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.firstspringbootapplication.model.User;

	@RestController
	@RequestMapping(path = "/external-output",
	produces = "application/xml")
	public class ExternalController {
		@Value("${uri}")
		String uri;
		
		@Value("${uri.id}")
		String uriId;

		@GetMapping
		public String printMessage(){
			return "I will use other web application services";
		}
		@GetMapping("/users")
		public Object getUsers(){
			RestTemplate template = new RestTemplate();
			
			return template.getForObject(uri, Object.class);
			
		}
		@GetMapping("/user")
		public User getUser(){
			RestTemplate template = new RestTemplate();
			return template.getForObject(uriId, User.class);
			
		}
		
	}

