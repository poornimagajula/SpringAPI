package com.regnant.mobilekart.DAO;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regnant.mobilekart.entity.HREntity;
import com.regnant.mobilekart.repository.HRRepository;

@Service
public class HRDAOImpl implements HRDAO {

	@Autowired
	HRRepository hrRepository;

	@Override
	public HREntity addHR(HREntity hr) {
		
		String pwd = Base64.getEncoder().encodeToString(hr.getPassword().getBytes());
		
		hr.setPassword(pwd);
		
		return hrRepository.save(hr);
	}

	@Override
	public List<HREntity> getAllHR() {
		
		return hrRepository.findAll();
	}

	@Override
	public boolean checkHR(HREntity hr) {
		
		List<HREntity> hlist = getAllHR();
		
		for (HREntity h : hlist) {
			
			if (h.getUserName().equals(hr.getUserName()) && h.getPassword().equals(hr.getPassword())) {
				
				return true;
			}
		}
		return false;
	}
	
	public HREntity decodeHR(String header) {

		String encHead = header.split(" ")[1];

		System.out.println("Encoded Header: " + encHead);

		byte[] byteArray = Base64.getDecoder().decode(encHead.getBytes());

		String decHead = new String(byteArray);

		System.out.println("Decoded Header :" + decHead);

		String decoder[] = decHead.split(":");
		
		String pwd = Base64.getEncoder().encodeToString(decoder[1].getBytes());
		
		HREntity hr = new HREntity(decoder[0], pwd);
		
		System.out.println("Username :" + decoder[0] + "Password" + pwd);

		return hr;

	}

}
