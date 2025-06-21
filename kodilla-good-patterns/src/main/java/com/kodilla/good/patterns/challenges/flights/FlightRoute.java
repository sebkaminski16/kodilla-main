package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlightRoute {
    List<String> cities = new ArrayList<>();

    public FlightRoute(String... citiesInFlight) {
        if(citiesInFlight.length > 3) throw new IllegalArgumentException("Max 3 cities in a route");
        for(String city : citiesInFlight) {
            if(!this.cities.contains(city)) {
                this.cities.add(city);
            }
        }
    }

    public List<String> getCities() {
        return cities;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FlightRoute that = (FlightRoute) o;
        return Objects.equals(cities, that.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cities);
    }
}
