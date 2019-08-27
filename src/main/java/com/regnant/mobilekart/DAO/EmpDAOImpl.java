package com.regnant.mobilekart.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regnant.mobilekart.entity.EmpEntity;
import com.regnant.mobilekart.repository.EmpRepository;

@Service
public class EmpDAOImpl implements EmpDAO{

	@Autowired
	EmpRepository empRepository;
	
	@Override
	public EmpEntity addEmp(EmpEntity emp) {		
		return empRepository.save(emp);
	}

	@Override
	public List<EmpEntity> getAllEmployess() {
		return empRepository.findAll();
	}


}
