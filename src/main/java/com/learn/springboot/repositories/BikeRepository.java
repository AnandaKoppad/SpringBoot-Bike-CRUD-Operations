package com.learn.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike , String>
{

}
