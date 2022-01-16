package com.finastra.java8springbooth2maven;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8SpringbootH2MavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java8SpringbootH2MavenApplication.class, args);
    }

}
