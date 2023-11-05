package com.example.ExampleAPI.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExampleAPI.student.model.Favorite;



public interface FavoriteRepository 
extends JpaRepository<Favorite, Long>
{
	Favorite findById(long id);
	
}
