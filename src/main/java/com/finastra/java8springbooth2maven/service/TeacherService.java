package com.finastra.java8springbooth2maven.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.finastra.java8springbooth2maven.model.NamePrefix;
import com.finastra.java8springbooth2maven.model.Student;
import com.finastra.java8springbooth2maven.model.Teacher;
import com.finastra.java8springbooth2maven.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> createDefaultListTeacher(){
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher(1, NamePrefix.MRS,"Golda","Meir","golda.meir@gmail.com","123654789"));
        teacherList.add(new Teacher(2,NamePrefix.MR,"David","Ben Gurion","david@gmail.com","987456321"));
        teacherList.add(new Teacher(3,NamePrefix.PROF,"Albert","Einshtein","alberta@gmail.com","741258741"));
        return teacherRepository.saveAll(teacherList);
    }

    public Teacher createTeacher(String requestBody) {
        Teacher teacherToCreate;

        try {
            teacherToCreate = new ObjectMapper().readValue(requestBody, Teacher.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
        return teacherRepository.save(teacherToCreate);
    }
}
