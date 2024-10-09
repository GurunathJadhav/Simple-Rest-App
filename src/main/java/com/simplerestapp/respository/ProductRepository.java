package com.simplerestapp.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplerestapp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
