package com.ofu.Swagger.service;

import com.ofu.Swagger.model.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CarRepository extends JpaRepository<Car,Long> {

    @Query("SELECT name from Car where name=?1")
    public List<String> getByName(String searchName);

    @Query("SELECT c from Car c where c.name= :searchName")
    public List<Car> getByCarAndName(@Param("searchName") String searchName);

    @Modifying
    @Query(value = "INSERT INTO Car (id, name) VALUES (:id, :name)",nativeQuery = true)
    public void insertCar(@Param("id") long id, @Param("name") String name);


    @Modifying
    @Query(value = "update Car c set c.name = :newName where c.id = :ID",nativeQuery = true)
    public void updateCarName(@Param("ID") long id,@Param("newName") String newName);


}
