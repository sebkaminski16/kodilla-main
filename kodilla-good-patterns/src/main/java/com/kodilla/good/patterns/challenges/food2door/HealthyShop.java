package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class HealthyShop extends FoodSupplier {
    public HealthyShop(String name) {
        super(name);
    }

    @Override
    public boolean process(String foodType, int quantity) {
        return this.getProductsList().contains(foodType) && quantity > 0;
    }

    @Override
    public List<String> getProductsList() {
        return List.of("Watermelon", "Banana", "Apple", "Orange");
    }
}
