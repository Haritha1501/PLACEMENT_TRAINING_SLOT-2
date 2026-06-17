package com.example.student_course;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private long stud_id;
    private String studName;
    private long course_id;
    public Student(){}
//    public Student(long stud_id, String studName, long course_id) {
//        this.stud_id = stud_id;
//        this.studName = studName;
//        this.course_id = course_id;
//    }
    public long getStud_id() {
        return stud_id;
    }
    public String getStudName() {
        return studName;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
    public long getCourse_id() {
        return course_id;
    }
    public void setCourse_id(long course_id){
        this.course_id = course_id;
    }
    public void setStud_id(long stud_id) {
        this.stud_id = stud_id;
    }

}
