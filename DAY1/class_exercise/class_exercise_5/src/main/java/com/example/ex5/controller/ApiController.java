package com.example.ex5.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex5.model.Students;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController 
{
    @GetMapping("/allstudents")
    public ArrayList<Students> getMethodName() 
    {
        ArrayList<Students> ll = new ArrayList<Students>();

        Students s1 = new Students("Tim",100);
        Students s2 = new Students("Cook", 101);

        ll.add(s1);
        ll.add(s2);

        return ll;
    }
    
    
}
