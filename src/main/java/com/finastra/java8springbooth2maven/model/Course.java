package com.finastra.java8springbooth2maven.model;

import com.finastra.java8springbooth2maven.util.NameValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "course")
public class Course {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer courseId;
     @NameValidation
//     @Pattern(regexp = "0-9, !@#$%&()+={[]}|;:<>/?",message = "Not valid course name")
     private String name;
     private int semester;
     @Transient
     private int units;
     private String preliminaryCourse;

    // @OneToMany(mappedBy = "course")
//     private Set<Curriculum> curriculums;
//
}
