package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Document(indexName = "Kisi")
public class Kisi {

    @Id
    private String id;
    @Field(name = "name",type = FieldType.Text)
    private String name;
    @Field(name = "adress",type = FieldType.Text)
    private String adress;


    public Kisi(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
