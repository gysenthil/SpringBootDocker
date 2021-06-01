package com.tarento.sbdock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarento.sbdock.model.User;
import com.tarento.sbdock.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	@RequestMapping("/users")
	public List<User> getUsers() {
		
		List<User> users = userRepository.findAll();
		return users;
	}
	
	@PostMapping("/create")
	public String saveUsers(@RequestBody User user) {
		System.out.println(user.getFirst_name());
		Integer result = userRepository.save(user);
		System.out.println("Result is "+result);
		if (result == 1) {
			return "User Saved Successfully";
		}
		else {
		    return "User Creation Failed";
		}
	}
}
