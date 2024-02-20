package com.learn.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.entity.Bike;
import com.learn.springboot.services.BikeService;


@RestController
@RequestMapping("/bike")
public class BikeController 
{

	BikeService bikesrv;

	public BikeController(BikeService bikesrv) {
		super();
		this.bikesrv = bikesrv;
	}
	
	//Create the Bike Object
	@PostMapping
	public String addBike(@RequestBody Bike b)
	{
		String msg=bikesrv.addBike(b);
		return msg;
	}

	//Fetching a Specific Bike Object
	@GetMapping("{eng_No}")
	public Bike getBike(@PathVariable String eng_No)
	{
		Bike b=bikesrv.getBike(eng_No);
		return b;
	}
	
	//Fetching all the Bike Objects
	@GetMapping
	public List<Bike> getAllBikes()
	{
		List<Bike> blist=bikesrv.getAllBikes();
		return blist;
	}
	
	@PutMapping
	public String updateBike(@RequestBody Bike b)
	{
		String updatebk=bikesrv.updateBike(b);
		return updatebk;
	}
	
	@DeleteMapping("{eng_No}")
	public String deleteBike(@PathVariable String eng_No)
	{
		String deletebk=bikesrv.deleteBike(eng_No);
		return deletebk;
	}
}
