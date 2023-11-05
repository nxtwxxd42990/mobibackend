package com.example.ExampleAPI.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ExampleAPI.student.model.Product;

public interface ProductRepository 
extends JpaRepository<Product, Long>
{
	Product findById(long id);
	Product findByName(String name);
	 
}
