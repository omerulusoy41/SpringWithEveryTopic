package com.ofu.Swagger.controller;

import com.ofu.Swagger.model.Car;
import com.ofu.Swagger.service.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Api(value="Car Api", description="Operations car")
public class CarController{

    @Autowired
    private CarService service;

//    @GetMapping("/{id}")
//    public ResponseEntity<Car> getFindByID(@PathVariable long id){
//        return ResponseEntity.ok(service.getCarByID(id).orElse(null));
//    }
    @GetMapping("/{name}")
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

    @PostMapping("/create")
    public ResponseEntity<Car> getAll(@RequestBody Car car){
        return ResponseEntity.ok(service.create(car));
    }

    @PutMapping("/update")
    public ResponseEntity<Car> update(@RequestBody Car car) {
        return ResponseEntity.ok(service.create(car));
    }

}
