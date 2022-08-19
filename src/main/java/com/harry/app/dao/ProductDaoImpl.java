package com.harry.app.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.harry.app.model.Product;
import com.harry.app.rowMapper.ProductRowMapper;

@Component
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public Product getProductById(Integer productId) {
		
		String sql = "SELECT product_id , product_name , category , image_url , price , stock , description , created_date , last_modified_date "
				+ "FROM product "
				+ "WHERE product_id = :productId ";
		
		Map<String, Object> map = new HashMap<>();
		map.put("productId", productId);
		
		List<Product> productData = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());
		
		if (productData.size() > 0) {
			return productData.get(0);
			
		} else {
			
			return null;
		}
		
	
	}
}
