package com.ofu.Testforpersonservicecomminication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Person")
public class Person {

    @Id
    @Column(name="id")
    public int personID;
    @Column(name = "name")
    public String name;

    @Override
    public String toString() {
        return "Person{" +
                "personID=" + personID +
                ", name='" + name + '\'' +
                '}';
    }
}
