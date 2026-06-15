package com.example.front_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController

public class CalcController {
    @GetMapping("calc/add/{a}/{b}")
    /*
    public String add(@PathVariable int a, @PathVariable int b) {
        return "Addition : " + (a + b);
    }
    */
    public Map<String, Object> add(@PathVariable int a, @PathVariable int b){
        return Map.of("Operation","addition","result",a+b);
    }
    @GetMapping("calc/diff/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b){
        return "Subtraction : "+Math.abs(a-b);
    }
    @GetMapping("calc/prod/{a}/{b}")
    public String mul(@PathVariable int a, @PathVariable int b){
        return "Multiplication : "+(a*b);
    }
    @GetMapping("calc/div/{a}/{b}")
    public String divide(@PathVariable int a, @PathVariable int b){
        return "Division : "+(a/b);
    }
    @GetMapping("calc/sin/{a}")
    public String sinVal(@PathVariable double a){
        return "Sine value of "+a+" : "+String.format("%.2f",Math.sin(a));
    }
    @GetMapping("calc/cos/{a}")
    public String cosVal(@PathVariable double a){
        return "Cosine value of "+a+" : "+String.format("%.2f",Math.cos(a));
    }
    @GetMapping("calc/log/{a}")
    public String logVal(@PathVariable double a){
        return "Logarithmic value to base 10 of "+a+" : "+String.format("%.2f",Math.log10(a));
    }
    @GetMapping("calc/log2/{a}")
    public String log2Val(@PathVariable double a){
        return "Logarithmic value to base 2 of "+a+" : "+String.format("%.2f",(Math.log(a)/Math.log(2)));
    }
    @GetMapping("spiral_matrix")
    public List spiralMat() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}, {3, 4, 5, 6}};
        List<Integer> lst = new ArrayList<>();
        int n = arr.length;
        int top = 0, btm = n - 1, lft = 0, rt = n - 1;
        while (top <= btm && lft <= rt) {
            for (int i = lft; i <= rt; i++) {
                lst.add(arr[top][i]);
            }
            top++;
            for (int j = top; j <= btm; j++) {
                lst.add(arr[j][rt]);
            }
            rt--;
            if (top <= btm) {
                for (int k = rt; k >= lft; k--) {
                    lst.add(arr[btm][k]);
                }
                btm--;
                for (int l = btm; l >= top; l--) {
                    lst.add(arr[l][lft]);
                }
                lft++;
            }
        }
        return lst;
    }


}
