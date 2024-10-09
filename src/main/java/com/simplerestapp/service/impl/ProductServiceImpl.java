package com.simplerestapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplerestapp.entity.Product;
import com.simplerestapp.exception.ProductNotFoundException;
import com.simplerestapp.respository.ProductRepository;
import com.simplerestapp.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public List<Product> productList() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getByProductId(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not found"));
	}

}
