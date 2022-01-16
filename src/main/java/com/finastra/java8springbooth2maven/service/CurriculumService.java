package com.finastra.java8springbooth2maven.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.finastra.java8springbooth2maven.model.Curriculum;
import com.finastra.java8springbooth2maven.model.Student;
import com.finastra.java8springbooth2maven.repository.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CurriculumService {

    @Autowired
    private CurriculumRepository curriculumRepository;


    public Curriculum createCurriculum(String requestBody){
        Curriculum curriculumToCreate;
        try {
            curriculumToCreate = new ObjectMapper().readValue(requestBody, Curriculum.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
        return curriculumRepository.save(curriculumToCreate);
    }

    public List<Curriculum> getAllCurriculum(){
       return curriculumRepository.findAll();
    }

    public Curriculum getCurriculumById(String id){
       return  curriculumRepository.findById(Integer.valueOf(id)).orElse(null);
    }
}
