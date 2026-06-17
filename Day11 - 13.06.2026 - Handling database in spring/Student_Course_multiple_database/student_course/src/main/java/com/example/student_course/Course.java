package com.example.student_course;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue
    private long course_id;
    private String course_name;
    private long stud_id;
    public Course() {}
//    public Course(long course_id, String course_name, long stud_id) {
//        this.course_id = course_id;
//        this.course_name = course_name;
//        this.stud_id = stud_id;
//    }
    public long getCourse_id() {
        return course_id;
    }
    public void setCourse_id(long course_id){
        this.course_id = course_id;
    }
    public String getCourse_name() {
        return course_name;
    }
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    public long getStudId() {
        return stud_id;
    }
    public void setStudId(long stud_id) {
        this.stud_id = stud_id;
    }
}
