package com.ofu.graphQLAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("person")
public class Author {

    @Id
    public long id;
    public String name;
    public List<Book> books;

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
