package com.example.ExampleAPI.student.payload;

import com.example.ExampleAPI.student.model.Product;
import com.example.ExampleAPI.student.model.User;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class FavoritePayload {
	private long id;
	private User userId;
	private Product productId;
}
