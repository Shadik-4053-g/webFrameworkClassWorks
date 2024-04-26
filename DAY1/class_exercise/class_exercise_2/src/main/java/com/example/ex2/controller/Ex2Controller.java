package com.example.ex2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Ex2Controller {
    
    @GetMapping("/student/{name}")
    public String getStudentName(@PathVariable("name") String name) {
        return "Welcome " + name + "!";
    }
}
