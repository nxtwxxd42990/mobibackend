package com.example.ExampleAPI.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExampleAPI.student.model.User;
import com.example.ExampleAPI.student.repository.UserRepository;
import com.example.ExampleAPI.student.service.IUser;

@Service
public class UserService implements IUser{

	@Autowired
	UserRepository userRepository;
	@Override
	public List<User> getAllUser() {
		
		return userRepository.findAll();
	}

	@Override
	public User save(User u) {
		
		return userRepository.save(u);
	}

}
