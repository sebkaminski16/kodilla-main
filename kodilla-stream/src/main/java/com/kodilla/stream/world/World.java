package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class World {
    private final List<Continent> continentsList = new ArrayList<>();

    public World(Continent... continents) {
        for(Continent continent : continents) continentsList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
       return continentsList.stream()
               .flatMap(continent -> continent.getCountriesList().stream())
               .map(element -> element.getPeopleQuantity())
               .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    };
}
