package com.kodilla.good.patterns.challenges.productorderservice;

import java.time.LocalDateTime;

public class SQLOrderRepository implements OrderRepository{
    @Override
    public void createOrder(Customer customer, Item item, LocalDateTime time) {
        System.out.println("Created and inserted a new order in the SQL database!");
    }
}
