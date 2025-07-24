package com.termiwum.orderservice.repository;

import com.termiwum.orderservice.model.Order;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public List<Order> findAll() {
        return orders;
    }

    public void save(Order order) {
        orders.add(order);
    }
}
