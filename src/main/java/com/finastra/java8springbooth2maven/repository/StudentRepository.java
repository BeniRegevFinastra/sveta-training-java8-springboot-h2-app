package com.finastra.java8springbooth2maven.repository;

import com.finastra.java8springbooth2maven.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findStudentByLastName(String lastName);

    List<Student> findStudentByFirstNameOrLastName(String firstName, String lastName);

    List<Student> findStudentsByMainSubjectAndSecondarySubjectInAndYearLessThan(String mainSubject, List<String> subjectList, int year);
}