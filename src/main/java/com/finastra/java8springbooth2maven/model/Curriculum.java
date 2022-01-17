package com.finastra.java8springbooth2maven.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.Set;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courseId", nullable = false)
    private Course course;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "curriculum_student_join",
            joinColumns = @JoinColumn(name = "curriculumId"), inverseJoinColumns = @JoinColumn(name = "studentId"))
    private Set<Student> studentList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacherId", nullable = false)
    private Teacher teacher;

    @Enumerated
    @Column(nullable = false)
    private Semester semester;

    @Temporal(TemporalType.DATE)
    private Date startOn;

//    @Column(name = "end_date")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
//    private LocalDate endsOn;

    @Min(value = 0, message = "The value should be positive")
    private int grade;

}
