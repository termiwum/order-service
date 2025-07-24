package com.termiwum.orderservice.controller;

import com.termiwum.orderservice.model.Order;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final List<Order> orders = new ArrayList<>();

    @GetMapping
    public List<Order> getAllOrders() {
        return orders;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        order.setId((long) (orders.size() + 1));
        orders.add(order);
        return order;
    }
}
