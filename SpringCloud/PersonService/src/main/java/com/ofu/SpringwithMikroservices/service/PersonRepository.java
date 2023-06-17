package com.ofu.SpringwithMikroservices.service;

import com.ofu.SpringwithMikroservices.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {
}
