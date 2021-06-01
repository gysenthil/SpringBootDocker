package com.tarento.sbdock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarento.sbdock.model.User;
import com.tarento.sbdock.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
	   
		List<User> users = userRepository.findAll(); 
		return users;
	}

	@Override
	public int createUser(User user) {
		return userRepository.save(user);
	}

}
