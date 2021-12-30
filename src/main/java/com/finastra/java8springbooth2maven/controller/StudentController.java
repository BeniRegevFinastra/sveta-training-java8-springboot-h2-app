package com.finastra.java8springbooth2maven.controller;

import com.finastra.java8springbooth2maven.model.Student;
import com.finastra.java8springbooth2maven.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping(path = "/students")
    public Student createStudent(@RequestBody String requestBody){
        return studentService.createStudent(requestBody);
    }

    @GetMapping(path = "students/all")
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @GetMapping(path="students/{id}")
    public Student getStudentById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @PutMapping(path="students/{id}")
    public Student updateStudent(@RequestBody String requestBody, @PathVariable String id){
        return studentService.updateStudent(id,requestBody);
    }

    @PostMapping(path="students/test")
    public List<Student> createDefaultListOfStudents(){
        return studentService.createDefaultListOfStudents();
    }

    @DeleteMapping(path="students/{id}")
    public Student deleteStudent(@PathVariable String id){
        return studentService.deleteStudent(id);
    }

    @GetMapping(path = "students/lastname/{lastname}")
    public List<Student> getStudentByLastName( @PathVariable String lastname){
        return studentService.getStudentByLastName(lastname);
    }

    @GetMapping(path = "students/by-subject")
    public List<Student> getStudentsByMainSubjectAndSecondarySubjectAndYear(@RequestParam String mainSubject,@RequestParam List<String> secondarySubject, @RequestParam int year){
        return studentService.getStudentsByMainSubjectAndSecondarySubjectAndYear(mainSubject,secondarySubject,year);
    }

    @GetMapping(path = "students/by-name")
    public List<Student> getStudentsByFirstNameOrLastName(@RequestParam String firstName, @RequestParam String lastName){
        return studentService.getStudentsByFirstOrLastName(firstName,lastName);
    }
}
