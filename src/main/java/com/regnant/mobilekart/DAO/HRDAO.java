package com.regnant.mobilekart.DAO;

import java.util.List;

import com.regnant.mobilekart.entity.HREntity;

public interface HRDAO {
	
	public HREntity addHR(HREntity hr);
	
	public List<HREntity> getAllHR();
	
	public boolean checkHR(HREntity hr);
	
	public HREntity decodeHR(String header);
	
}
