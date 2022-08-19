package com.harry.app.dao;

import com.harry.app.model.Product;

public interface ProductDao {
	
	Product getProductById(Integer productId);
}
