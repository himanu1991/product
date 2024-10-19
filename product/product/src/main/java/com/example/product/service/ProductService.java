package com.example.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.product.entity.Product;

/*
 * This is service layer of product.
 */

@Service
public interface ProductService {
	
	public List<Product> getProductList();
	
	public Product getProductById(long id);

}
