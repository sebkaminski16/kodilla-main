package com.kodilla.good.patterns.challenges.productorderservice;

public class AllegroOrderService implements OrderService {
    @Override
    public boolean order(Customer customer, Item item) {
        return customer != null && item != null;
    }
}
