package com.pfe.faculty.service.impl;


import org.springframework.stereotype.Service;

import com.pfe.faculty.entities.User;
import com.pfe.faculty.repository.UserRepository;
import com.pfe.faculty.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	

	
	

}
