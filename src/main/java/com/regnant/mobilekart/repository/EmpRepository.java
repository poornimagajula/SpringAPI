package com.regnant.mobilekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.regnant.mobilekart.entity.EmpEntity;

public interface EmpRepository extends JpaRepository<EmpEntity, Integer> {

}
