package com.finastra.java8springbooth2maven.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.finastra.java8springbooth2maven.model.Address;
import com.finastra.java8springbooth2maven.model.Gender;
import com.finastra.java8springbooth2maven.model.Student;
import com.finastra.java8springbooth2maven.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student createStudent(String requestBody) {
        Student studentToCreate;

        try {
            studentToCreate = new ObjectMapper().readValue(requestBody, Student.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
        return studentRepository.save(studentToCreate);
    }

    public List<Student> createDefaultListOfStudents() {
        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(new Student(1, "Aria", "Stark", "Biology", "Management", 1, Gender.FEMALE, generateAddress(10)));
        listOfStudent.add(new Student(2, "John", "Stark1", "Biology", "Economy", 2, Gender.MALE, generateAddress(11)));
        listOfStudent.add(new Student(3, "Sansa", "Stark", "Computers", "Biology", 5, Gender.FEMALE, generateAddress(12)));
        return studentRepository.saveAll(listOfStudent);
    }

    private Address generateAddress(int i) {
        return new Address(i, "Avenue street" + i, 25 + i, "85495" + i);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(Integer.valueOf(id)).orElse(null);
    }

    public Student updateStudent(String id, String requestBody) {
        Student studentToUpdate = this.getStudentById(id);
        Student newStudentDtls;
        try {
            newStudentDtls = new ObjectMapper().readValue(requestBody, Student.class);
            studentToUpdate.setFirstName(newStudentDtls.getFirstName());
            studentToUpdate.setLastName(newStudentDtls.getLastName());
            studentToUpdate.setMainSubject(newStudentDtls.getMainSubject());
            studentToUpdate.setSecondarySubject(newStudentDtls.getSecondarySubject());
            studentToUpdate.setYear(newStudentDtls.getYear());
            studentToUpdate.setGender(newStudentDtls.getGender());
            studentToUpdate.setAddress(newStudentDtls.getAddress());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
        return studentRepository.save(studentToUpdate);
    }

    public Student deleteStudent(String id) {
        Student studentToDelete = this.getStudentById(id);
        if (studentToDelete != null) {
            studentRepository.delete(studentToDelete);
        }
        return studentToDelete;
    }

    public List<Student> getStudentByLastName(String lastName) {
        return studentRepository.findStudentByLastName(lastName);
    }

    public List<Student> getStudentsByFirstOrLastName(String firstName, String lastName) {
        return studentRepository.findStudentByFirstNameOrLastName(firstName, lastName);
    }

    public List<Student> getStudentsByMainSubjectAndSecondarySubjectAndYear(String mainSubject, List<String> secondarySubjectList, int year) {
        return studentRepository.findStudentsByMainSubjectAndSecondarySubjectInAndYearLessThan(mainSubject, secondarySubjectList, year);
    }
}
