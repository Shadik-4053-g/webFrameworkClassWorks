package com.example.ex1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex1Controller
{
    @GetMapping("/welcome")
    public String func()
    {
        return "Welcome to Spring Boot!";
    }
}