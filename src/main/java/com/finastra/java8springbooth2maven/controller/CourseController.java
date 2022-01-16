package com.finastra.java8springbooth2maven.controller;

import com.finastra.java8springbooth2maven.dto.APIResponse;
import com.finastra.java8springbooth2maven.model.Course;
import com.finastra.java8springbooth2maven.service.CourseService;
import com.finastra.java8springbooth2maven.validate.CourseValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @Autowired
    private CourseValidation validator;

    @InitBinder(value = "course")
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }

    @PostMapping("test")
    public List<Course> createDefaultCourseList() {
        return courseService.createDefaultCourses();
    }

    @PostMapping("")
    public ResponseEntity<APIResponse> createCourse(@Valid @RequestBody Course requestBody) {
        APIResponse apiResponse = new APIResponse();
        Course course = courseService.createCourse(requestBody);
        apiResponse.setData(course);
        apiResponse.setStatus(HttpStatus.OK);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
