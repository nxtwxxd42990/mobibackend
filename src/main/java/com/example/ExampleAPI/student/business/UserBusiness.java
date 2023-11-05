package com.example.ExampleAPI.student.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExampleAPI.student.json.UserListJson;
import com.example.ExampleAPI.student.model.User;
import com.example.ExampleAPI.student.payload.UserPayload;
import com.example.ExampleAPI.student.service.impl.UserService;

@Service
public class UserBusiness {
	@Autowired
	UserService userService;
	
	public List<UserListJson> getListUser(){
		return UserListJson.packJsons(userService.getAllUser());
	}
	
	public void saveUser(UserPayload userPayload) {
		User user = new User(
				userPayload.getUser(),
				userPayload.getName(),
				userPayload.getEmail(),
				userPayload.getPassword(),
				userPayload.getDescription());
		userService.save(user);
	}
}
