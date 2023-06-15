package com.ofu.Swagger.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Car")
public class Car {
        @Id
        @Column(name = "id")
        public long ID;

        @Column (name = "name")
        public String name;

        public long getID() {
                return ID;
        }

        public void setID(long ID) {
                this.ID = ID;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
}
