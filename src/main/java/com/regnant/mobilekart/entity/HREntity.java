package com.regnant.mobilekart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "hr_tbl", schema = "mobile_cart")
public class HREntity {

	@Id
	@GeneratedValue
	int id;

	@NotBlank
	String userName, password;	
	
	public HREntity() {	}

	public HREntity(@NotBlank String userName, @NotBlank String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
