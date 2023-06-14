package com.ofu.Swagger.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Car {
        @Id
        @Column(name = "id")
        public long ID;
        @Column (name = "name")
        public String name;
}
