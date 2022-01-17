package com.finastra.java8springbooth2maven.repository;

import com.finastra.java8springbooth2maven.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
