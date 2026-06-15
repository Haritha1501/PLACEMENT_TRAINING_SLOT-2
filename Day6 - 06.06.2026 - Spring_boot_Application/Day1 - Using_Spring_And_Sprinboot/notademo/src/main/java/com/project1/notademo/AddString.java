package com.project1.notademo;
import java.lang.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddString {

    @GetMapping("calc/adds/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){
        return "Addition is :"+(a+b);
    }
    @GetMapping("calc/subtract/{a}/{b}")
    public String subtract(@PathVariable int a, @PathVariable int b){
        if(a>b) return "Difference is :"+(a-b);
        return "Difference is :"+(b-a);
    }
    @GetMapping("calc/multiply/{a}/{b}")
    public String multiply(@PathVariable int a, @PathVariable int b){
        return "Product is "+(a*b);
    }
    @GetMapping("calc/quotient/{a}/{b}")
    public String quotient(@PathVariable int a, @PathVariable int b){
        return "Quotient is "+Math.round(a/b);
    }
    @GetMapping("/remaind/{a}/{b}")
    public String remainder(@PathVariable int a, @PathVariable int b){
        return "remainder is "+(a%b);
    }
    @GetMapping("/oddeven/{a}/{b}")
    public String oddeven(@PathVariable int a, @PathVariable int b){
        int res = a+b;
        if(res%2==0) return "Sum is even";
        return "Sum is odd";
    }
    @GetMapping("/name/{urname}")
    public String isurname(@PathVariable String urname){
        String sysname = "harithams";
        if(urname.toLowerCase().equals(sysname)) return "It is your name";
        return "I don't know who you are. Unknown user";
    }
    @GetMapping("/climate/{temp}")
    public String climate(@PathVariable int temp){
        String clim = "";
        if(temp<=0) clim = "Shivering";
        else if(temp>=1 && temp<15) clim = "Chill";
        else if(temp>=15 && temp<24) clim = "Happy";
        else if(temp>=24 && temp<30) clim = "Towards hot";
        else if(temp>=30 && temp<32) clim = "HOTTER";
        else clim = "OMG";
        return clim;
    }

}

