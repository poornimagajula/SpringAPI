package com.regnant.mobilekart.DAO;

import java.util.List;

import com.regnant.mobilekart.entity.ProductEntity;

public interface ProductDAO {
	
	public ProductEntity addProduct(ProductEntity pe);
	 
    public List<ProductEntity> getAllProducts();
 
    public ProductEntity updateProduct(ProductEntity pe);
 
    public ProductEntity getProduct(Long pid);
    
    public void deleteProduct(ProductEntity pe);

}
