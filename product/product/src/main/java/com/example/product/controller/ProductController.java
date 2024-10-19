package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;

/*
 * This controller is useful of product relate APIs.
 */

@RestController
public class ProductController {
	
	@Autowired ProductService productService;
	
	/*
	 * This method is use for get all available list of products.
	 */
	@GetMapping("/products")
	public ResponseEntity<Object> getProductList() {
		List<Product> productList = productService.getProductList();
		if (CollectionUtils.isEmpty(productList)) {
			return new ResponseEntity<Object>("no one product is exist in DB", HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Object>(productList, HttpStatus.OK);
	}
	
	/*
	 * This method is use for get a product by id.
	 */
	@GetMapping("/products/{id}")
	public ResponseEntity<Object> getProductById(@PathVariable Long id) {
		Product product = productService.getProductById(id);
		if (product == null) {
			return new ResponseEntity<Object>("product doesn't exist in DB", HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Object>(product, HttpStatus.OK);
	}

}
