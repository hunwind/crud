package com.example.springbootcrudexample.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "car")
@Getter
@Setter
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "car_year")
    private String car_year;

    @Column(name="brand")
    private String brand;

    @Column(name="model")
    private String model;

    @Column(name="makeModel")
    private String makeModel;

    @Column(name="price")
    private int price;

    @Column(name="builderPlace")
    private String builderPlace;
}