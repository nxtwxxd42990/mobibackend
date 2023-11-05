package com.example.ExampleAPI.student.json;

import java.util.ArrayList;
import java.util.List;

import com.example.ExampleAPI.student.model.Favorite;
import com.example.ExampleAPI.student.model.Product;
import com.example.ExampleAPI.student.model.User;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class FavoriteListJson {

	private long id;
	private User userId;
	private Product productId;
	
	public static FavoriteListJson packJson(Favorite favorite) {
		FavoriteListJson favoriteList = new FavoriteListJson();
		favoriteList.setId(favorite.getId());
		favoriteList.setUserId(favorite.getUser());
		favoriteList.setProductId(favorite.getProduct());
		
		return favoriteList;
	}
	
	public static List<FavoriteListJson> packJsons(List<Favorite> favorites){
		List<FavoriteListJson> favoriteListJson = new ArrayList<FavoriteListJson>();
		for(Favorite favorite : favorites) {
			favoriteListJson.add(packJson(favorite));
		}
		return favoriteListJson;
	}
}
