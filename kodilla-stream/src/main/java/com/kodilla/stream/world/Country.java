package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal peopleQuantity;
    private final String name;

    public Country(int peopleQuantity, String name) {
        this.peopleQuantity = BigDecimal.valueOf(peopleQuantity);
        this.name = name;
    }

    public BigDecimal getPeopleQuantity() {
        return this.peopleQuantity;
    }
}
