package com.example.ExampleAPI.student.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserPayload {

	private String name;
	private String user;
	private String password;
	private String email;
	private String description;
}
