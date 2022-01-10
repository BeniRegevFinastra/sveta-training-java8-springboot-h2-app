package com.finastra.java8springbooth2maven.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "teacher")
// TODO - Sveta: validate first and last names contains only the following valid characters:
//   Upper & lowercase letters - start with 1 and dot or comma, or at least 2
//   space (0 or more times)
//   dot (0 or 1 time)
//   comma (0 or 1 time)
//   dash (0 or more times)
public class Teacher {
    @Id
    private Integer id;
    @Enumerated(EnumType.STRING)
    private NamePrefix prefix;
    // TODO - Sveta: column name first_name, not-null, not unique,
    //  insertable, updatable, max 15 characters
    private String firstName;
    // TODO - Sveta: column name last_name, not-null, not unique,
    //  insertable, updatable, max 30 characters.
    private String lastName;
    // TODO - Sveta: column name email, nullable, unique,
    //  insertable, updatable, max 50 characters.
    //  Validation: VALID E-MAIL ADDRESS
    private String email;
    // TODO - Sveta: column name phone_number, nullable, unique,
    //  insertable, updatable, max 25 characters.
    //  Validation: VALID INTERNATIONAL PHONE NUMBER
    private String phoneNumber;

    //  TODO - Sveta: the method will return the object as a valid json string.
    public String toJson() {
        return null;
    }
}
