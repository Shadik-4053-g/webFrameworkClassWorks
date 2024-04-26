package com.example.ex4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex4.model.Book;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController 
{
    Date d = new Date();
    @GetMapping("/path")
    public Book func()
    {
        return new Book("Success","Roi",d);
    }
    
    
}
