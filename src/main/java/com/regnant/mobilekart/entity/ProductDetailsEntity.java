package com.regnant.mobilekart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="product_details", schema="mobile_cart")
public class ProductDetailsEntity {

@Id
@Column(name="pdid")
@GeneratedValue
private int pdid;

@Column(name="ram")
private String ram;

@Column(name="rom")
private String rom;

@Column(name="camera")
private String camera;

@Column(name="battery")
private String battery;

@Column(name="size")
private String size;

@Column(name="price")
private String price;

public int getPdid() {
return pdid;
}

public void setPdid(int pdid) {
this.pdid = pdid;
}

public String getRam() {
return ram;
}

public void setRam(String ram) {
this.ram = ram;
}

public String getRom() {
return rom;
}

public void setRom(String rom) {
this.rom = rom;
}

public String getCamera() {
return camera;
}

public void setCamera(String camera) {
this.camera = camera;
}

public String getBattery() {
return battery;
}

public void setBattery(String battery) {
this.battery = battery;
}

public String getSize() {
return size;
}

public void setSize(String size) {
this.size = size;
}

public String getPrice() {
return price;
}

public void setPrice(String price) {
this.price = price;
}

}

