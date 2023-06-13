package com.ofu.graphQLAPI.controller;


import com.ofu.graphQLAPI.service.GraphQLRepository;
import com.ofu.graphQLAPI.model.Author;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Api {
    private GraphQLRepository repo;

    public Api(GraphQLRepository repo){
        this.repo = repo;
    }

    @QueryMapping
    public List<Author> getAllPerson(){
        return repo.findAll();
    }

}