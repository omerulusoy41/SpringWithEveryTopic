package com.ofu.Swagger.service;

import com.ofu.Swagger.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository repo;

    public CarService(CarRepository repo){
        this.repo = repo;
    }
    public Optional<Car> getCarByID(long id){
        return repo.findById(id);
    }

    public List<Car> getCarAll(){
        return repo.findAll();
    }

    public Car create(Car car) {
        repo.save(car);
        return car;
    }

    public List<String> getCarByName(String name) {
        return  repo.getByName(name);
    }
    public List<Car> getCarWithName(String name) {
        return  repo.getByCarAndName(name);
    }
}
