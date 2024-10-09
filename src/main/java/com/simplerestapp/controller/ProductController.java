package com.simplerestapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.simplerestapp.entity.Product;

@RequestMapping("/api/product")
public interface ProductController {
	
	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product);
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> getByProductId(@PathVariable int id);
	
	@GetMapping
	public ResponseEntity<List<Product>> getAll();

}
