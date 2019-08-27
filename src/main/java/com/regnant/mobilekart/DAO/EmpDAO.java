package com.regnant.mobilekart.DAO;

import java.util.List;

import com.regnant.mobilekart.entity.EmpEntity;

public interface EmpDAO {
	
	public EmpEntity addEmp(EmpEntity emp);
	
	public List<EmpEntity> getAllEmployess();

}
