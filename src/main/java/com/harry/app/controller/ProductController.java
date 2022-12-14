package com.harry.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harry.app.dto.ProductDTO;
import com.harry.app.model.Product;
import com.harry.app.service.ProductServices;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServices productServices;
	
	@GetMapping("/products/{productId}")
	public ResponseEntity<Product> getProductData(@PathVariable(name = "productId", required = true) Integer productId) {
		Product productData = productServices.getProductById(productId);
		
		if (productData != null) {
			return ResponseEntity.status(HttpStatus.OK).body(productData);
		} return null;
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductDTO producDTO) {
		Integer productId = productServices.createProduct(producDTO);
		Product product = productServices.getProductById(productId);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
}
