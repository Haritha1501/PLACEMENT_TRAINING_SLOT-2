package com.example.assessment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AssessEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String task;
    private String name;
    private String date;
    public AssessEntity(){}
    
    public long getId(){
        return id;
    }
    public void setId(Long id){ this.id = id; }
    public String getTask(){
        return task;
    }
    public void setTask(String task){ this.task = task; }
    public String getName(){
        return name;
    }
    public void setName(String name){ this.name = name; }
    public String getDate(){
        return date;
    }
    public void setDate(String date){ this.date = date; }

}
