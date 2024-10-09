package com.simplerestapp.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.simplerestapp.controller.ProductController;
import com.simplerestapp.entity.Product;
import com.simplerestapp.service.ProductService;

@RestController
public class ProductControllerImpl implements ProductController {

	@Autowired
	private ProductService productService;
	
	@Override
	public ResponseEntity<Product> createProduct(Product product) {
		
		return new ResponseEntity<>(productService.createProduct(product),HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Product> getByProductId(int id) {
		return ResponseEntity.ok(productService.getByProductId(id));
	}

	@Override
	public ResponseEntity<List<Product>> getAll() {
		return ResponseEntity.ok(productService.productList());
	}

}
