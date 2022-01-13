package com.finastra.java8springbooth2maven.controller;

import com.finastra.java8springbooth2maven.model.Course;
import com.finastra.java8springbooth2maven.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("test")
    public List<Course> createDefaultCourseList(){
        return courseService.createDefaultCourses();
    }
}
