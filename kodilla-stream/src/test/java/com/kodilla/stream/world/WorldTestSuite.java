package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        Country poland = new Country(37_000_000, "Poland");
        Country china = new Country(1_200_000_000, "China");
        Country uganda = new Country(50_000_000, "Uganda");
        Country argentina = new Country(70_000_000, "Argentina");

        Continent europe = new Continent("Europe", poland);
        Continent asia = new Continent("Asia", china);
        Continent africa = new Continent("Africa", uganda);
        Continent latinAmerica = new Continent("Latin America", argentina);

        World world = new World(europe, asia, africa, latinAmerica);
        BigDecimal worldPopulation = world.getPeopleQuantity();

        Assertions.assertEquals(BigDecimal.valueOf(1_357_000_000), worldPopulation);
    }
}
