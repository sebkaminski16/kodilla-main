package com.kodilla.good.patterns.challenges.productorderservice;

import java.time.LocalDateTime;

public interface OrderRepository {
    public void createOrder(Customer customer, Item item, LocalDateTime time);
}
