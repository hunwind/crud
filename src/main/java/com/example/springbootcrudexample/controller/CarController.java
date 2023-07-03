package com.example.springbootcrudexample.controller;

import com.example.springbootcrudexample.entity.Car;
import com.example.springbootcrudexample.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/save")
    public ResponseEntity <Car> addCar(@RequestBody Car car){
        Car addCar= (Car) carService.addCar(car);
        return new ResponseEntity<Car>(addCar, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Car>> getAllCar(){
        List<Car> allCar = carService.findAllCar();
        return new ResponseEntity<List<Car>>(allCar, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Car> getCarId(@PathVariable("id")Long id){
        Car carById = carService.getCarById(id);
        return new ResponseEntity<Car>(carById, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCarById(@PathVariable("id") Long id){
        carService.deleteCarById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}