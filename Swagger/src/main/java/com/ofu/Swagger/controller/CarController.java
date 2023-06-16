package com.ofu.Swagger.controller;

import com.ofu.Swagger.model.Car;
import com.ofu.Swagger.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class CarController{

    @Autowired
    private CarService service;

    @GetMapping("/{id}")
    public ResponseEntity<Car> getFindByID(@PathVariable long id){
        return ResponseEntity.ok(service.getCarByID(id).orElse(null));
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<List<String>> getFindByName(@PathVariable String name){
        return ResponseEntity.ok(service.getCarByName(name));
    }
    @GetMapping("/Car/{name}")
    public ResponseEntity<List<Car>> getFindCarWithByName(@PathVariable String name){
        return ResponseEntity.ok(service.getCarWithName(name));
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAll(){
        return ResponseEntity.ok(service.getCarAll());
    }

    @PostMapping("/create1")
    public ResponseEntity<Car> create(@RequestBody Car car){
        return ResponseEntity.ok(service.create1(car));
    }

    @PutMapping("/update")
    public ResponseEntity<Car> update(@RequestBody Car car) {
        return ResponseEntity.ok(service.create1(car));
    }

    @PutMapping("/update/{id}/{newName}")
    public ResponseEntity<List<Car>> update(@PathVariable("id") String id,@PathVariable("newName") String newName)
    {
        return ResponseEntity.ok(service.updateName(Integer.parseInt(id),newName));
    }

    @PostMapping("/create2")
    public ResponseEntity<Car> create2(@RequestBody Car car){
        return ResponseEntity.ok(service.create2(car));
    }

}
