package com.termiwum.orderservice.service;

import com.termiwum.orderservice.model.Order;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class OrderService {
    private final List<Order> orders = new ArrayList<>();

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order createOrder(Order order) {
        order.setId((long) (orders.size() + 1));
        orders.add(order);
        return order;
    }
}
