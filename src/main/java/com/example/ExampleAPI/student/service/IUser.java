package com.example.ExampleAPI.student.service;

import java.util.List;

import com.example.ExampleAPI.student.model.User;

public interface IUser {
	List<User> getAllUser();
	User save(User u);
}
