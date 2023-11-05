package com.example.ExampleAPI.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExampleAPI.student.model.Product;
import com.example.ExampleAPI.student.repository.ProductRepository;
import com.example.ExampleAPI.student.service.IProduct;
@Service
public class ProductService implements IProduct{
	@Autowired
	ProductRepository productRepository;
	@Override
	public List<Product> getALLUser() {
		
		return productRepository.findAll();
	}

	@Override
	public Product findByName(String name) {

		return productRepository.findByName(name);
	}

	@Override
	public Product save(Product pd) {
		
		return productRepository.save(pd);
	}
	
	
}
