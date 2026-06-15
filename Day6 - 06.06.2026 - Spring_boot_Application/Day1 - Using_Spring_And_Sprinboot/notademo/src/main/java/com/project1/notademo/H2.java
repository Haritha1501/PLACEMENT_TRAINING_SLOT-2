package com.project1.notademo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class H2 {
    @GetMapping("/myhtml")
    public String sayHello(){
        return "<style>\n" +
                "body{\n" +
                "background-image: linear-gradient(135deg, #ef5fe0, #006d2c);"+
                "}\n" +
                "</style>\n" +
                "<body>\n" +
                "<h1>Hello, haritha</h1> <br>\n" +
                "<img src='https://m.media-amazon.com/images/I/51PvAAOoKML._AC_UF350,350_QL80_.jpg'>\n" +
                "<p> How are you? <br> I think you are not fine without me.<b> However Happy afternoon everyone :)</b> </p>;\n" +
                "</body>";
    }
}