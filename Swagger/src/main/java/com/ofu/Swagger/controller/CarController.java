package com.ofu.Swagger.controller;

import com.ofu.Swagger.model.Car;
import com.ofu.Swagger.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Car")
public class CarController{

    @Autowired
    private CarService service;

    @GetMapping("/{id}")
    public ResponseEntity<Car> getFindByID(@PathVariable long id){
        return ResponseEntity.ok(service.getCarByID(id).orElse(null));
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAll(){
        return ResponseEntity.ok(service.getCarAll());
    }

    @PostMapping("/create")
    public ResponseEntity<Car> getAll(@RequestBody Car car){
        return ResponseEntity.ok(service.create(car));
    }

    @PutMapping("/update")
    public ResponseEntity<Car> update(@RequestBody Car car) {
        return ResponseEntity.ok(service.create(car));
    }

}
