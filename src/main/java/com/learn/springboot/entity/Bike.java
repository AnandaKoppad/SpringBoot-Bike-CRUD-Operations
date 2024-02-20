package com.learn.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike 
{
    @Id
	String eng_No;
	String brand;
	int cost;
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(String eng_No, String brand, int cost) {
		super();
		this.eng_No = eng_No;
		this.brand = brand;
		this.cost = cost;
	}
	public String getEng_No() {
		return eng_No;
	}
	public void setEng_No(String eng_No) {
		this.eng_No = eng_No;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [eng_No=" + eng_No + ", brand=" + brand + ", cost=" + cost + "]";
	}
}
