package com.finastra.java8springbooth2maven.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
     private String name;
     private int semester;
     private int units;
}
