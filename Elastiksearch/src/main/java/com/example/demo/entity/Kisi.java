package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "kisiler")
public class Kisi {

    @Id
    private String id;
    @Field(name = "ad",type = FieldType.Text)
    private String name;
    @Field(name = "adres",type = FieldType.Text)
    private String adress;
    @Field(name = "dtarihi",type = FieldType.Date)
    private Date dtarihi;
}
