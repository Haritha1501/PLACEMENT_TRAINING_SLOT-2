package com.example.student_course;

import java.util.ArrayList;

public class StudentRepository {
    private ArrayList<Student> students = new ArrayList<>();
    public StudentRepository(ArrayList<Student> students) {
        this.students = students;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public Student addStudent(Student student){
        students.add(student);
        return student;
    }
}
