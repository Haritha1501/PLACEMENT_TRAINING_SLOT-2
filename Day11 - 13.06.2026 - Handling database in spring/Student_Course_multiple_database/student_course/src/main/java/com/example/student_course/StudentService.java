package com.example.student_course;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<StudentRepository> student_service= new ArrayList<>();
    private int stud_id=1;
    public int nextStudentId(){
        return stud_id++;
    }

    private final List<CourseRepository> course_service = new ArrayList<>();
    private int course_id=1;
    public int nextCourseId(){
        return course_id++;
    }

}
