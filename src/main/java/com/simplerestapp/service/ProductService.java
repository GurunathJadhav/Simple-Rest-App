package com.simplerestapp.service;

import java.util.List;

import com.simplerestapp.entity.Product;

public interface ProductService {
	
	Product createProduct(Product product);
	
	List<Product> productList();
	
	Product getByProductId(int id);

}
