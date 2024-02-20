package com.learn.springboot.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.springboot.entity.Bike;
import com.learn.springboot.repositories.BikeRepository;

@Service
public class BikeServiceImplementations implements BikeService
{

	BikeRepository bkrepo;

	public BikeServiceImplementations(BikeRepository bkrepo) {
		super();
		this.bkrepo = bkrepo;
	}

	@Override
	public String addBike(Bike b) 
	{
		bkrepo.save(b);
		return "Bike is Added";
	}

	@Override
	public Bike getBike(String eng_No) 
	{
		Bike b=bkrepo.findById(eng_No).get();
		return b;
	}

	@Override
	public List<Bike> getAllBikes() {
		List<Bike> blist=bkrepo.findAll();
		return blist;
	}

	@Override
	public String updateBike(Bike b) {
		bkrepo.save(b);
		return "Bike is Updated";
	}

	@Override
	public String deleteBike(String eng_No) {
		bkrepo.deleteById(eng_No);
		return "Bike is Deleted";
	}


}
