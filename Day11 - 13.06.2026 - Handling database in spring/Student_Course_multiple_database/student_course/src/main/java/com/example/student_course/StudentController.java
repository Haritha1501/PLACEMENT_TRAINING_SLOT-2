package com.example.student_course;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    private StudentRepository studentRepository;
    private CourseRepository courseRepository;
    private final List<Student> student_control = new ArrayList<>();
    private final List<Course> course_control = new ArrayList<>();
    @PostMapping("/student/{stud_name}/{course_id}")
    public Student addStudent(@RequestBody Student st, @PathVariable String stud_name, @PathVariable int course_id){
        st.setStud_id(studentService.nextStudentId());
        st.setStudName(stud_name);
        st.setCourse_id(studentService.nextCourseId());
        student_control.add(st);
        return st;
    }

    @PostMapping("/course/{course_name}/{stud_id}")
    public Course addCourse(@RequestBody Course c, @PathVariable String course_name, @PathVariable long stud_id){
        c.setCourse_id(studentService.nextCourseId());
        c.setCourse_name(course_name);
        c.setStudId(studentService.nextStudentId());
        course_control.add(c);
        return c;
    }

    @GetMapping("/student")
    public List<Student> getStudents(){
        return student_control;
    }

    @GetMapping("/course")
    public List<Course> getCourses(){
        return course_control;
    }

}
