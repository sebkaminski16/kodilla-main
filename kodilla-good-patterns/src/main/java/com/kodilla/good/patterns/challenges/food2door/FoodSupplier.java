package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public abstract class FoodSupplier {
    private final String name;

    protected FoodSupplier(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract boolean process(String foodType, int quantity);
    public abstract List<String> getProductsList();
}
