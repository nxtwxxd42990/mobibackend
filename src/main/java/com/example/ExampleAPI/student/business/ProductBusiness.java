package com.example.ExampleAPI.student.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExampleAPI.student.json.ProductListJson;
import com.example.ExampleAPI.student.service.impl.ProductService;

@Service
public class ProductBusiness {

	@Autowired
	ProductService  productService;
	
	public List<ProductListJson> getListProduct(){
		return ProductListJson.packJsons(productService.getALLUser());
	}
	public ProductListJson getProductByName(String name) {
		return ProductListJson.packjson(productService.findByName(name));
	}
}
