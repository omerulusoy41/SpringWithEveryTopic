package com.ofu.graphQLAPI.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.print.Book;
import java.util.List;

@Document("person")
public class Author {

    @Id
    public long id;
    public String name;
}
