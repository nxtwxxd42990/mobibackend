package com.example.ExampleAPI.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExampleAPI.student.model.Favorite;

import com.example.ExampleAPI.student.repository.FavoriteRepository;
import com.example.ExampleAPI.student.service.IFavorite;

@Service
public class FavoriteService implements IFavorite{

	@Autowired
	FavoriteRepository favoriteRepository;
	@Override
	public List<Favorite> getAllFavorite() {
		
		return favoriteRepository.findAll();
	}
	@Override
	public Favorite save(Favorite f) {
		// TODO Auto-generated method stub
		return  favoriteRepository.save(f);
	}

	

}
