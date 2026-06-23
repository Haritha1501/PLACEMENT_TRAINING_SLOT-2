package com.example.TableGenerate;

import org.springframework.stereotype.Service;

@Service
public class TableService {
    public String getTable(int a){
        String res=" ";
        for(int i=1;i<11;i++){
            res += "\n"+i+" * " +a+" = "+(i*a) ;
        }
        return res;
    }
}