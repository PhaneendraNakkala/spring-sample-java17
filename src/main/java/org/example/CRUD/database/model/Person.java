package org.example.CRUD.database.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Person {

    @Id
    private String id;

    @NotNull
    @Size(min = 1, max = 100)
    @Getter
    @Setter
    private String name;

    @Min(0)
    @Getter
    @Setter
    private int age;

    public String getId() {
        return id;
    }

// Getters and Setters
}
