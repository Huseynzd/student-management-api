package com.huseynzd.studentmanegementapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    private List<Student> students = new ArrayList<>();
    @GetMapping
    public List<Student> getAllStudents(){
        return students;
    }
}
