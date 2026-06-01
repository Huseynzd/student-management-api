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
    @PutMapping("/{id}")
    public Student updateStudentsByID(@PathVariable Integer id,@RequestBody Student updatedStudent){
        for (Student student : students){
            if (student.getId().equals(id)){
                student.setName(updatedStudent.getName());
                student.setSurname(updatedStudent.getSurname());
                student.setAge(updatedStudent.getAge());
            }
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public String deleteStudentByID(@PathVariable Integer id){
        for (Student student : students){
            if (student.getId().equals(id)){
                students.remove(student);
                return "Student is deleted";
            }
        }
        return "Student not found";
    }
}
