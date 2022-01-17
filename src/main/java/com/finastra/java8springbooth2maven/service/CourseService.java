package com.finastra.java8springbooth2maven.service;


import com.finastra.java8springbooth2maven.model.Course;
import com.finastra.java8springbooth2maven.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> createDefaultCourses() {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1, "Math", 1, 3, "Algebra"));
        courseList.add(new Course(2, "Biology", 2, 5, "Bio"));
        courseList.add(new Course(3, "Algebra", 3, 5, ""));
        return courseRepository.saveAll(courseList);
    }

    public Course createCourse(Course courseToCreate) {
        return courseRepository.save(courseToCreate);
    }
}
