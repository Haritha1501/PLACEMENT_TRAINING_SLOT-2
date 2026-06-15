package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/name")
    public String sayName(){
        return "i am haritha";
    }
    @GetMapping("/address")
    public String sayaddress(){
        return "i am from tamil nadu ";
    }
    @GetMapping("/color")
    public String saycolor(){
        return "my favourite color is green";
    }
}
