package com.example.ex2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex2.model.Student;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController 
{
    @GetMapping("/student")
    public Student getMethodName() 
    {
        return new Student("Jef",1);
    }
        
}
