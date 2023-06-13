package com.ofu.graphQLAPI.controller;


import com.ofu.graphQLAPI.model.Book;
import com.ofu.graphQLAPI.service.GraphQLRepository;
import com.ofu.graphQLAPI.model.Author;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
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
    public Author addPerson(@Argument AuthorIn authorIn){
        Author aut = new Author();
        aut.setId(authorIn.id);
        aut.setName(authorIn.name);
        List<Book> books = new ArrayList<>();
        for(BookIn in: authorIn.books){
            Book book =new Book();
            book.setID(in.id);
            book.setName(in.name);
            books.add(book);
        }
        aut.setBooks(books);
        repo.save(aut);
        return aut;
    }

    record AuthorIn(int id, String name, List<BookIn> books){}
    record BookIn (int id, String name){}

}