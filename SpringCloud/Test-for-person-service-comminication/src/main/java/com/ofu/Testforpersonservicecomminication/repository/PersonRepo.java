package com.ofu.Testforpersonservicecomminication.repository;

import com.ofu.Testforpersonservicecomminication.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {
}
