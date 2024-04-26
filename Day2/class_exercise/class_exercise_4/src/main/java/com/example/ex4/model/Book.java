package com.example.ex4.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Book 
{
    private String title;
    private String author;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date publication;
    
    public Book(String a,String b,Date c)
    {
        this.title=a;
        this.author=b;
        this.publication=c;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublication() {
        return publication;
    }
    
}
