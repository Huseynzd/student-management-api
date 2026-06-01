package com.huseynzd.studentmanegementapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    private  List<Student> students = new ArrayList<>();

    @GetMapping
    public List<Student> getAllStudents(){
        return students;
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
    @GetMapping("/{id}")
    public Student getStudentsByID(@PathVariable Integer id){
        for(Student student : students){
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
}
