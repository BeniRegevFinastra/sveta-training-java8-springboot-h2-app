package com.finastra.java8springbooth2maven.controller;

import com.finastra.java8springbooth2maven.model.Curriculum;
import com.finastra.java8springbooth2maven.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/curriculum")
public class CurriculumController {

    @Autowired
    private CurriculumService curriculumService;

    @PostMapping
    public Curriculum createCurriculum(@RequestBody String requestBody){
        return curriculumService.createCurriculum(requestBody);
    }

    @GetMapping(path = "/all")
    public List<Curriculum> getAllCurriculum(){
        return curriculumService.getAllCurriculum();
    }

    @GetMapping("/{id}")
    public Curriculum getByCurriculumId(@PathVariable String id){
        return curriculumService.getCurriculumById(id);
    }

    @DeleteMapping("/{id}")
    public Curriculum deleteCurriculumById(@PathVariable String id){
        return curriculumService.deleteCurriculum(id);
    }
}
