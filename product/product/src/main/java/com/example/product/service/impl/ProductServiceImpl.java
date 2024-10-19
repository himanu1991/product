package com.example.product.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;

/*
 * This is service implementation layer for product, that is useful for writing the business logic
 */

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired ProductRepository productRepository;

	@Override
	public List<Product> getProductList() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(long id) {
		Optional<Product> product = productRepository.findById(id);
		if (product != null) {
			return product.get();
		}
		return null;
	}

}
