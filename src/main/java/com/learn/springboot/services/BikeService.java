package com.learn.springboot.services;

import java.util.List;

import com.learn.springboot.entity.Bike;

public interface BikeService 
{

	String addBike(Bike b);

	Bike getBike(String eng_No);

	List<Bike> getAllBikes();

	String updateBike(Bike b);

	String deleteBike(String eng_No);
}
