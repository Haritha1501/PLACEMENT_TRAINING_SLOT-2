package com.example.student_course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private List<Course> course = new ArrayList<Course>();
    public CourseRepository(List<Course> course){
        this.course = course;
    }
    public List<Course> findAllCourse(){
        return course;
    }
    public Course addCourse(Course c){
        course.add(c);
        return c;
    }
}
