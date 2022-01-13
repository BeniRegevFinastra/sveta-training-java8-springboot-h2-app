package com.finastra.java8springbooth2maven.controller;

import com.finastra.java8springbooth2maven.model.Teacher;
import com.finastra.java8springbooth2maven.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping(path= "teacher/test")
    public List<Teacher> createDefaultTeacherList(){
        return teacherService.createDefaultListTeacher();
    }

    @PostMapping("teacher")
    public Teacher createTeacher(@Valid @RequestBody String requestBody){
        return teacherService.createTeacher(requestBody);
    }
}
