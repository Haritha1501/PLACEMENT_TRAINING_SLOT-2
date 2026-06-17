package com.example.onetoone;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    @OneToOne
    @JoinColumn(name="profile_id")
    private StudentProfile profile;
}

