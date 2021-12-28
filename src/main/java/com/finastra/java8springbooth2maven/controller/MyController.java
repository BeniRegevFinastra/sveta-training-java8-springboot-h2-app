package com.finastra.java8springbooth2maven.controller;

import com.finastra.java8springbooth2maven.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapp/api")
public class MyController {
    @Autowired
    private MyService myService;

    @GetMapping("/ping")
    public String pingMyApp() {
        return "You reached the server";
    }
    @GetMapping("/sayhello")
    public String sayHello() {
        return myService.sayHello();
    }
}
