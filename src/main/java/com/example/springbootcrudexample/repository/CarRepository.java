package com.example.springbootcrudexample.repository;

import com.example.springbootcrudexample.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {



}
