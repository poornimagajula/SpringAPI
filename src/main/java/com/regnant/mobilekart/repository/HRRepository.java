package com.regnant.mobilekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.regnant.mobilekart.entity.HREntity;

@Repository
public interface HRRepository extends JpaRepository<HREntity, Integer> {
	
}
