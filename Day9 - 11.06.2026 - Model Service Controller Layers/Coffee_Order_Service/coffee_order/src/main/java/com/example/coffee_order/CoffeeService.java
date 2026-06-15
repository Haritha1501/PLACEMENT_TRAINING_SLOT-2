package com.example.coffee_order;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {
    private final List<String> order = new ArrayList<>();
    private int id = 1;
    public long nextId() {
        return id++;
    }
    public void orderCof(String type, String cust_name){
        order.add(type);
        order.add(cust_name);
    }
    public List<String> getOrder(String type){
        return order;
    }

}

