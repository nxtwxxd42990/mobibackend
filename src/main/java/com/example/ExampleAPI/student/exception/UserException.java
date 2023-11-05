package com.example.ExampleAPI.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.ExampleAPI.exception.BaseException;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserException extends BaseException{
	private static final long serialVersionUID = 1L;
	public UserException(String code, HttpStatus status) {
		super("student."+ code, status);
		
	}
	
	public static UserException emptyUser() {
		return new UserException("findUser.notFound", HttpStatus.BAD_REQUEST);
	}

}
