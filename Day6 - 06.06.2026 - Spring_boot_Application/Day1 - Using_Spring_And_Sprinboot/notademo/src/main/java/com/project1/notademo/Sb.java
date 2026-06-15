package com.project1.notademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sb{
    @GetMapping("/calculate/{a}/{b}")
    public String calculate(@PathVariable int a, @PathVariable int b){
        StringBuilder sb = new StringBuilder();
        sb.append("Addition : ").append(a+b).append("\n");
        sb.append("Subtraction : ").append(Math.abs(a-b)).append("\n");
        sb.append("Multiplication : ").append(a*b).append("\n");
        if(b!=0) {
            sb.append("Division : ").append(a/b).append("\n");
            sb.append("Remainder : ").append(a%b).append("\n");
        }else {
            sb.append("Division by zero will be infinity and does not produce answers for quotient and remainder");
        }
        return """
                <style>
                pre {
                  display: block;
                  font-family: cursive;
                  color: pink;
                  white-space: pre;
                  margin: 1em 0;
                }
                </style>
                <body>
                <pre> 
                """ + sb.toString() +
                """
                </pre>
                </body>
                """;
    }

}