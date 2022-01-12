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
     private int courseId;
     private String name;
     private String semester;
     private String units;
}
