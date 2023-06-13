package com.ofu.graphQLAPI.controller;


import com.ofu.graphQLAPI.service.GraphQLRepository;
import com.ofu.graphQLAPI.model.Author;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

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

    @QueryMapping
    public Optional<Author> getPersonByID(@Argument Long id){
        return repo.findById(id);
    }

    @MutationMapping
    public Author addPerson(@Argument Input authorIn){
        Author aut = new Author();
        aut.setId(authorIn.id);
        aut.setName(authorIn.name);
        repo.save(aut);
        return aut;
    }

    record Input(int id,String name){}

}