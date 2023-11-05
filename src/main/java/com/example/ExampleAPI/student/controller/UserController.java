package com.example.ExampleAPI.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExampleAPI.exception.BaseException;
import com.example.ExampleAPI.student.business.FavoriteBusiness;
import com.example.ExampleAPI.student.business.ProductBusiness;
import com.example.ExampleAPI.student.business.UserBusiness;
import com.example.ExampleAPI.student.json.FavoriteListJson;
import com.example.ExampleAPI.student.json.ProductListJson;
import com.example.ExampleAPI.student.json.UserListJson;
import com.example.ExampleAPI.student.payload.FavoritePayload;
import com.example.ExampleAPI.student.payload.UserPayload;
import com.example.ExampleAPI.student.service.impl.FavoriteService;
import com.example.ExampleAPI.student.service.impl.ProductService;
import com.example.ExampleAPI.student.service.impl.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	UserBusiness userBusiness;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ProductBusiness productBusiness;
	
	@Autowired
	FavoriteService favoriteService;
	
	@Autowired
	FavoriteBusiness favoriteBusiness;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping(value = "/users")
	public ResponseEntity<List<UserListJson>> getAllUser() throws BaseException{
		return ResponseEntity.ok(userBusiness.getListUser());
	}
	
	@GetMapping(value = "/products")
	public ResponseEntity<List<ProductListJson>> getAllProduct() throws BaseException{
		return ResponseEntity.ok(productBusiness.getListProduct());
	}
	
	@GetMapping(value = "/favorite")
	public ResponseEntity<List<FavoriteListJson>> getAllFavorite() throws BaseException{
		return ResponseEntity.ok(favoriteBusiness.getListFavorite());
	}
	
	@GetMapping(value="/products/{name}")
	public ResponseEntity<ProductListJson> getnameproduct(@PathVariable("name") String name) throws BaseException{
		return ResponseEntity.ok(productBusiness.getProductByName(name));
	}
	
	@PostMapping(value="/user")
	public ResponseEntity<Void> saveUser (@RequestBody UserPayload payload) throws BaseException{
		userBusiness.saveUser(payload);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PostMapping(value="/favorite")
	public ResponseEntity<Void> savefa (@RequestBody FavoritePayload payload) throws BaseException{
		favoriteBusiness.savefa(payload);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
}
