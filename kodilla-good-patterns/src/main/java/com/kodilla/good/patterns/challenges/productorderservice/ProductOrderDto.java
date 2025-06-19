package com.kodilla.good.patterns.challenges.productorderservice;

import java.time.LocalDateTime;

public class ProductOrderDto {
    private Customer customer;
    private LocalDateTime date;

    public ProductOrderDto(Customer customer, LocalDateTime date) {
        this.customer = customer;
        this.date = date;
    };

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
