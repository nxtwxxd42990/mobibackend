package com.example.ExampleAPI.student.service;

import java.util.List;

import com.example.ExampleAPI.student.model.Product;

public interface IProduct {
	List<Product> getALLUser();
	Product findByName(String name);
	Product save(Product pd);
}
