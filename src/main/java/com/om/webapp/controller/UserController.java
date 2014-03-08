package com.om.webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.om.webapp.domain.User;

@RestController
public class UserController {
	@Autowired
	
	
	@RequestMapping("/userIndex")
	public @ResponseBody List<User> index() {

	
		 List<User> personsList = new ArrayList<>();
		 
		 personsList.add(new User(3));
	        System.out.println("-------------------------------");
	        
			 
		return personsList;

	}
	
}
