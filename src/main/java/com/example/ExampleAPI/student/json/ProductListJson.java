package com.example.ExampleAPI.student.json;

import java.util.ArrayList;
import java.util.List;

import com.example.ExampleAPI.student.model.Product;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductListJson {
	private String image;
	private String name;
	private String cpu;
	private String mb;
	private String vga;
	private String ram;
	private String ssd;
	private String hdd;
	private String psu;
	private String cases;
	private String price;
	
	public static ProductListJson packjson(Product product) {
		ProductListJson productList = new ProductListJson();
		productList.setName(product.getName());
		productList.setCpu(product.getCpu());
		productList.setMb(product.getMb());
		productList.setVga(product.getVga());
		productList.setRam(product.getRam());
		productList.setSsd(product.getSsd());
		productList.setHdd(product.getHdd());
		productList.setPsu(product.getPsu());
		productList.setCases(product.getCases());
		productList.setPrice(product.getPrice());
		productList.setImage(product.getImage());
		
		return productList;
	}
	
	public static List<ProductListJson> packJsons(List<Product> products){
		List<ProductListJson> productListJson = new ArrayList<ProductListJson>();
		for(Product product : products) {
			productListJson.add(packjson(product));
		}
		return productListJson;
	}

}
