package com.example.h2db;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    public Student() {} //=> required by JPA(Hibernate uses it internally)
    //constructor for quick object creation
    public Student(String name){
        this.name = name;
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
