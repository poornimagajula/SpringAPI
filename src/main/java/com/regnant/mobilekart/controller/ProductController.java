package com.regnant.mobilekart.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regnant.mobilekart.DAO.ProductDAO;
import com.regnant.mobilekart.entity.ProductEntity;


@RestController
@RequestMapping("/mobilekart")
public class ProductController {
	
	@Autowired	
	ProductDAO productDAO;
	
	@PostMapping("/products")
	public ProductEntity createProduct(@Valid @RequestBody ProductEntity pe) {
		return productDAO.addProduct(pe);
	}
	
	@GetMapping("/products")
	public List<ProductEntity> getAllProducts(){
		return productDAO.getAllProducts();
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductEntity> getProductById(@PathVariable(value = "id")Long pid) {
		ProductEntity pe = productDAO.getProduct(pid);
		if(pe == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(pe);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<ProductEntity> updateProduct(@PathVariable(value = "id")Long pid, @RequestBody ProductEntity pe) {
		
		ProductEntity pe1 = productDAO.getProduct(pid);
		if(pe1 == null) {
			return ResponseEntity.notFound().build();
		}
		pe1.setP_name(pe.getP_name());
		pe1.setP_path(pe.getP_path());
		
		ProductEntity updateProduct = productDAO.updateProduct(pe1);
		return ResponseEntity.ok().body(updateProduct);		
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<ProductEntity> deleteProduct(@PathVariable(value = "id")Long pid){
		
		ProductEntity pe = productDAO.getProduct(pid);
		if(pe == null) {
			return ResponseEntity.notFound().build();
		}		
		productDAO.deleteProduct(pe);		
		return ResponseEntity.ok().build();
	}
	
	
}
