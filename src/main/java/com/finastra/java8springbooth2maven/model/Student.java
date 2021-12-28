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
@Table(name="students")
public class Student {
    @Id
    private Integer id;

    private String firstName;
    private String lastName;
    private String mainSubject;
    private String secondarySubject;
    private int year;

}
