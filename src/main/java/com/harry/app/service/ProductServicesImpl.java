package com.harry.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.harry.app.dao.ProductDao;
import com.harry.app.dto.ProductDTO;
import com.harry.app.model.Product;

@Component
public class ProductServicesImpl implements ProductServices {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Product getProductById(Integer productId) {
		
		return productDao.getProductById(productId);
	}
	
	@Override
	public Integer createProduct(ProductDTO productDTO) {
		
		return productDao.createProduct(productDTO);
	}
	
	
}
