package com.regnant.mobilekart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "cart", schema = "mobile_cart")
public class CartEntity {

	@Id
	@Column(name = "cid")
	@GeneratedValue
	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
}
