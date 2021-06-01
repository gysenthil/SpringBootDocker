package com.tarento.sbdock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarento.sbdock.model.User;

@Service
public interface UserService {
	
	List<User> findAll();
	
	int createUser(User user);

}
