package com.regnant.mobilekart.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.regnant.mobilekart.entity.ProductEntity;
import com.regnant.mobilekart.repository.MobileRepository;

@Service
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private MobileRepository mobileRepository;
	
	
	public ProductEntity addProduct(ProductEntity pe) {
		
		return mobileRepository.save(pe);		
	}

	public List<ProductEntity> getAllProducts() {
		
		return mobileRepository.findAll();
	}
	
	public ProductEntity updateProduct(ProductEntity pe) {
		
		return mobileRepository.saveAndFlush(pe);
	}
	
	public ProductEntity getProduct(Long pid) {		
		
		return mobileRepository.getOne(pid);
	}
	
	public void deleteProduct(ProductEntity pe) {
		
		mobileRepository.delete(pe);
	}

}
