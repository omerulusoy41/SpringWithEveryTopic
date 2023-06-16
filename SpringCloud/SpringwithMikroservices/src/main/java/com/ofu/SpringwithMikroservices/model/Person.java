package com.ofu.SpringwithMikroservices.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "PERSON")
public class Person {

    @Id
    @Column(name = "id")
    public int ID;
    @Column(name = "name")
    public String name;
}
