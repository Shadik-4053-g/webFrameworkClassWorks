package com.example.ex4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex4.model.Address;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController 
{
    @GetMapping("/path")
    public Address getMethodName() 
    {
        return new Address("India","tamil nadu","fr","Main St","CBE","rn",1111,123);
    }
}
