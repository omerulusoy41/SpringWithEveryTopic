package com.example.demo.controller;

import com.example.demo.entity.Kisi;
import com.example.demo.service.KisiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KisiController {

    private final KisiRepo repo;

    public KisiController(KisiRepo repo){
        this.repo = repo;
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Kisi>> getAll(@PathVariable String search){
        List<Kisi> kisiler = repo.getByCustomQuery(search);
        return ResponseEntity.ok(kisiler);
    }

}
