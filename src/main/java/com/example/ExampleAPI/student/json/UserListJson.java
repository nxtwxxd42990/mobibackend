package com.example.ExampleAPI.student.json;

import java.util.ArrayList;
import java.util.List;

import com.example.ExampleAPI.student.model.User;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserListJson {
	private long id;
	private String name;
	private String user;
	private String password;
	private String email;
	private String description;
	
	public static UserListJson packjJson(User user) {
		UserListJson userList = new UserListJson();
		
		userList.setId(user.getId());
		userList.setName(user.getName());
		userList.setUser(user.getUser());
		userList.setPassword(user.getPassword());
		userList.setEmail(user.getEmail());
		userList.setDescription(user.getDescription());
		return userList;
	}
	
	public static List<UserListJson> packJsons(List<User> users){
		List<UserListJson> userListJson = new ArrayList<UserListJson>();
		for(User user : users) {
			userListJson.add(packjJson(user));
		}
		
		return userListJson;
	}
	
}
