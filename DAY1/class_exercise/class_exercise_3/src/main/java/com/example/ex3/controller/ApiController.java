package com.example.ex3.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController {

    @GetMapping("/favcolor")
    public String getMethodName(@RequestParam String color) {
        return "My favorite color is : "+color;
    }
    
    
}
