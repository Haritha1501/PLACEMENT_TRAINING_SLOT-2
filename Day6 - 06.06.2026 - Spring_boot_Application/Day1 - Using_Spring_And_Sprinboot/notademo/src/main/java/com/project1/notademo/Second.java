package com.project1.notademo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Second {

    @GetMapping("/hi/{name}")
    public String display(@PathVariable String name){
        return "hii "+name;
    }

}
