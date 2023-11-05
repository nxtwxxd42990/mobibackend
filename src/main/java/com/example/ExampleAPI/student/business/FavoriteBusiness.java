package com.example.ExampleAPI.student.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExampleAPI.student.json.FavoriteListJson;
import com.example.ExampleAPI.student.model.Favorite;
import com.example.ExampleAPI.student.payload.FavoritePayload;
import com.example.ExampleAPI.student.service.impl.FavoriteService;

@Service
public class FavoriteBusiness {
	@Autowired
	FavoriteService favoriteService;
	
	public List<FavoriteListJson> getListFavorite(){
		return FavoriteListJson.packJsons(favoriteService.getAllFavorite());
	}

	public void savefa(FavoritePayload fa) {
		Favorite favorite = new Favorite(
				fa.getUserId(),
				fa.getProductId());
		favoriteService.save(favorite);
	}
}
