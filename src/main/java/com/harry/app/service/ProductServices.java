package com.harry.app.service;

import com.harry.app.dto.ProductDTO;
import com.harry.app.model.Product;

public interface ProductServices {
	Product getProductById(Integer productId);
	
	Integer createProduct(ProductDTO producDTO);
}
