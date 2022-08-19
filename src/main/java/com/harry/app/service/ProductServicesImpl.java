package com.harry.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.harry.app.dao.ProductDao;
import com.harry.app.model.Product;

@Component
public class ProductServicesImpl implements ProductServices {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Product getProductById(Integer productId) {
		
		
		return productDao.getProductById(productId);
	}
	
	
}
