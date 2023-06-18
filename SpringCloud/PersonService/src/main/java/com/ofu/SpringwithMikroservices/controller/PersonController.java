package com.ofu.SpringwithMikroservices.controller;

import com.ofu.SpringwithMikroservices.model.Person;
import com.ofu.SpringwithMikroservices.service.PersonDBService;
import com.ofu.SpringwithMikroservices.service.PersonQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonDBService service;

    @Autowired
    private PersonQueue rabbitQueue;

    @GetMapping
    public ResponseEntity<List<Person>> getAll(){
        rabbitQueue.sendMessage("in getAll() method..");
        return  ResponseEntity.ok(service.getAll());
    }
}
