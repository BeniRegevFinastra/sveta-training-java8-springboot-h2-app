package com.finastra.java8springbooth2maven.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.finastra.java8springbooth2maven.util.NameValidation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Set;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "teacher")
// TODO - Sveta: validate first and last names contains only the following valid characters:
//   Upper & lowercase letters - start with 1 and dot or comma, or at least 2
//   space (0 or more times)
//   dot (0 or 1 time)
//   comma (0 or 1 time)
//   dash (0 or more times)
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherId;

    @Enumerated(EnumType.STRING)
    private NamePrefix prefix;
    // TODO - Sveta: column name first_name, not-null, not unique,
    //  insertable, updatable, max 15 characters
    @Column(name = "first_name",nullable = false,length=15)
    @Size(min=1,max = 15)
    @NameValidation
    private String firstName;
    // TODO - Sveta: column name last_name, not-null, not unique,
    //  insertable, updatable, max 30 characters.

    @Column(name="last_name",nullable = false,length = 30)
    private String lastName;
    // TODO - Sveta: column name email, nullable, unique,
    //  insertable, updatable, max 50 characters.
    //  Validation: VALID E-MAIL ADDRESS

   @Column(name = "email",unique = true,length = 50)
   //@Email(message = "Email address i snot valid")
   @Pattern(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",message = "Email not valid format")
    private String email;
    // TODO - Sveta: column name phone_number, nullable, unique,
    //  insertable, updatable, max 25 characters.
    //  Validation: VALID INTERNATIONAL PHONE NUMBER

    @Column(name="phone_number",unique = true,length = 25)
    @Pattern(regexp = "^\\+[0-9]{1,3}\\.[0-9]{4,14}(?:x.+)?$",message = "It not valid international number")
    private String phoneNumber;

//    @OneToMany(mappedBy = "teacher",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    private Set<Curriculum> curriculums;

    //  TODO - Sveta: the method will return the object as a valid json string.
    public String toJson() {
        String json = "";
        try {
            json =  new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
