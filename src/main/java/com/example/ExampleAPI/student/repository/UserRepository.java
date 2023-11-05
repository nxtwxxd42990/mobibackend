package com.example.ExampleAPI.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExampleAPI.student.model.User;

public interface UserRepository 
extends JpaRepository<User, Long>
{
	User findById(long id);
	
	
}
