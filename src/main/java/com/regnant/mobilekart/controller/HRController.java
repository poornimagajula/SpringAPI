package com.regnant.mobilekart.controller;


import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regnant.mobilekart.DAO.EmpDAO;
import com.regnant.mobilekart.DAO.HRDAO;
import com.regnant.mobilekart.entity.EmpEntity;
import com.regnant.mobilekart.entity.HREntity;

@RestController
@RequestMapping("/mobilekart")
public class HRController {

	@Autowired
	HRDAO hrDAO;

	@Autowired
	EmpDAO empDAO;
	
	@PostMapping("/HR")
	public HREntity addHR(@Valid @RequestBody HREntity hr) {
		return hrDAO.addHR(hr);
	}

	@GetMapping("/HR")
	public List<HREntity> getAllHR() {
		return hrDAO.getAllHR();
	}

	@PostMapping("/login")
	public boolean CheckHR(@Valid @RequestBody HREntity hr) {
		return hrDAO.checkHR(hr);
	}

	@PostMapping("/addEmp")
	public ResponseEntity<EmpEntity> addEmp(@Valid @RequestBody EmpEntity emp, @RequestHeader("Authorization") String head) {
		
		HREntity hr = hrDAO.decodeHR(head);

		if (hrDAO.checkHR(hr)) {
			
			EmpEntity e = empDAO.addEmp(emp);
			
			return ResponseEntity.ok().body(e);			
			
		}else
			return ResponseEntity.notFound().build();
	}

}
