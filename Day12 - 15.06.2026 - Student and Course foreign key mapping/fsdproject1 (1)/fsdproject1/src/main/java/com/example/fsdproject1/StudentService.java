package com.example.fsdproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student) {

        if (student.getCourses() != null) {
            for (Course c : student.getCourses()) {
                c.setStudent(student);
            }
        }

        return repo.save(student);
    }
    public List<Student> all(){
        return repo.findAll();
    }
}



