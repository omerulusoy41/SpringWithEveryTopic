package com.ofu.SpringwithMikroservices.service;

import com.ofu.SpringwithMikroservices.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PersonDBService {
    private final PersonRepository repository;

    public PersonDBService(PersonRepository repository){
        this.repository = repository;
    }

    public List<Person> getAll(){
//        List<Person> result = new ArrayList<>();
//        repository.findAll().forEach(result::add);
        List<Person> result = StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
        return result;
    }
}
