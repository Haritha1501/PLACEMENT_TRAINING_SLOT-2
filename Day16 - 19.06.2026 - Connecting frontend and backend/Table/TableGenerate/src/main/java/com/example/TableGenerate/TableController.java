package com.example.TableGenerate;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class TableController {
    private final TableService service;
    public TableController(TableService service){
        this.service=service;
    }
    @GetMapping("/hello/{a}")
    public String sayHello(@PathVariable int a){
        return service.getTable(a);
    }}