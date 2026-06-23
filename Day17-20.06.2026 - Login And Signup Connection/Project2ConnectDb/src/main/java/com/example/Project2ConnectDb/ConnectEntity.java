package com.example.Project2ConnectDb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ConnectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String text;
    public ConnectEntity() {}
    public ConnectEntity(String text) {
        this.text = text;
    }
    public long getId(){
        return id;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

}
