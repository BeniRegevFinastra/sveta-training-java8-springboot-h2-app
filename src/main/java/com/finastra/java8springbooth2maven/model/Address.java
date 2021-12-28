package com.finastra.java8springbooth2maven.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private Integer id;
    private String street;
    private int houseNum;
    private String zipcode;
}
