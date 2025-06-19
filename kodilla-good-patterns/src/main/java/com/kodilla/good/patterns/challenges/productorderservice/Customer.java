package com.kodilla.good.patterns.challenges.productorderservice;

public class Customer {
    private String name;
    private String surname;
    private String location;

    public Customer(String name, String surname, String location) {
        this.name = name;
        this.location = location;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLocation() {
        return location;
    }
}
