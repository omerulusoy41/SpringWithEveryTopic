package com.ofu.Swagger.service;

import com.ofu.Swagger.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {

    @Query("SELECT name from Car where name=?1")
    public List<String> getByName(String searchName);

    @Query("SELECT c from Car c where c.name= :searchName")
    public List<Car> getByCarAndName(@Param("searchName") String searchName);
}
