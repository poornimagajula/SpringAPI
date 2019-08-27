package com.regnant.mobilekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.regnant.mobilekart.entity.ProductEntity;

@Repository
public interface MobileRepository extends JpaRepository<ProductEntity, Long>{
	

}
