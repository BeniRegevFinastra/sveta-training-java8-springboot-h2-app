package com.finastra.java8springbooth2maven.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "curriculum")
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer curriculumId;

    private Integer courseId;
    private Integer studentId;
    private Integer teacherId;
    private Semester semester;
    private Date startOn;
    private LocalDate endsOn;
    private int grade;

}
