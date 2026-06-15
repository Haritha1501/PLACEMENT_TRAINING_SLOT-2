package com.example.repoOrder;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderRepository repo;

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return repo.findAll();
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return repo.save(order);
    }
}