package com.project1.notademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddInt {

    @GetMapping("/addi/{a}/{b}")
    public int display(@PathVariable int a, @PathVariable int b){
        int res = a+b;
        System.out.println("Addition is: "+res);
        return res;
    }
}

