package com.example.springbootcrudexample.service;

import com.example.springbootcrudexample.entity.Car;
import com.example.springbootcrudexample.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> findAllCar() {
        return carRepository.findAll();
    }

    public Car getCarById(Long carId) {
        Optional<Car> optionalCar = carRepository.findById(carId);
        return optionalCar.orElse(null); // If car is not found, return null
    }

    public void deleteCarById(long carId) {
        carRepository.deleteById(carId);
    }
}