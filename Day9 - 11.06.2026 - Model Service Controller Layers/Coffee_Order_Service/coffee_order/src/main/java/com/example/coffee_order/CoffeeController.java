package com.example.coffee_order;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {
//    private final CoffeeService service;
//    public CoffeeController(CoffeeService service) {
//        this.service = service;
//    }
//    @PostMapping("/{type}")
//    public Coffee orderCoffee(@PathVariable String type){
//        return service.orderCof(type);
//    }
//    @GetMapping
//    public List<String> displayCoffee(){
//        return service.getOrder();
//    }

//
//    @PostMapping
//    public String createItem(@RequestBody Coffee coff) {
//        coffee.add(coff);
//        String res = Coffee.idGenerate(coff);
//        return coff.getCust_name() + coff.getCoffee_type() + res;
//    }
//
//    @GetMapping
//    public List<Coffee> getCoffee() {
//        return coffee;
//    }

    private final List<Coffee> coff1 = new ArrayList<>();
    private final CoffeeService service;
    public CoffeeController(CoffeeService service) {
        this.service = service;
    }
    @PostMapping("/{name}/{type}")
    public Coffee orderCoffee(@RequestBody Coffee coffee1, @PathVariable("type") String type, @PathVariable("name") String name) {
        coffee1.setCoffee_type(type);
        coffee1.setCust_name(name);
        service.orderCof(type, name);
        coffee1.setId((int) service.nextId());
        coff1.add(coffee1);
        return coffee1;
    }
    @GetMapping
    public List<Coffee> getCoffee() {
        return coff1;
    }
}
