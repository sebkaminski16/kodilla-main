package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String name;
    private final List<Country> countriesList = new ArrayList<>();

    public Continent(String name, Country... countries) {
        this.name = name;
        for(Country country : countries) this.countriesList.add(country);
    }

    public List<Country> getCountriesList() {
        return new ArrayList<>(countriesList);
    }
}
