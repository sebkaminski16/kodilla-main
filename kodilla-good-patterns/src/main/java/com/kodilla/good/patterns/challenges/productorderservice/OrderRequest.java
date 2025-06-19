package com.kodilla.good.patterns.challenges.productorderservice;

public class OrderRequest {
    private final Customer customer;
    private final Item item;

    public OrderRequest(Customer customer, Item item) {
        this.customer = customer;
        this.item = item;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Item getItem() {
        return item;
    }
}
