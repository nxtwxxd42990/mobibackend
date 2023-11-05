package com.example.ExampleAPI.student.service;

import java.util.List;

import com.example.ExampleAPI.student.model.Favorite;


public interface IFavorite {
	List<Favorite> getAllFavorite();
	Favorite save(Favorite f);
}
