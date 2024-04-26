package com.example.ex1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex1.config.Ex1config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Ex1Conntroller 
{
    
    @Autowired
    public Ex1config ex1config;
    
    @GetMapping("/info")
    public String getMethodName() 
    {
        return "AppName is : "+ex1config.appname+" Version is :"+ex1config.Version;
    }
        
}
