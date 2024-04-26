package com.example.ex3.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex3.model.Student;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiController 
{
    @GetMapping("path")
    public Student getMethodName() {
        return new Student("Tim",100,"THIS IS A DESCRIPTION");
    }
        
}
