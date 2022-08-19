package com.harry.app.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.harry.app.model.Product;

public class ProductRowMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setCategory(rs.getString("category"));
		product.setCreateDate(rs.getDate("created_date"));
		product.setDescription(rs.getString("description"));
		product.setImgUrl(rs.getString("image_url"));
		product.setLastModifiedDate(rs.getDate("last_modified_date"));
		product.setPrice(rs.getInt("price"));
		product.setProductId(rs.getInt("product_id"));
		product.setProductName(rs.getString("product_name"));
		product.setStock(rs.getInt("stock"));
		
		return product;
	}
	
}
