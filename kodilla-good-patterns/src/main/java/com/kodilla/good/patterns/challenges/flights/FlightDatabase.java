package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlightDatabase {
    private final List<FlightRoute> flights = new ArrayList<>();

    public FlightDatabase() {
        this.flights.add(new FlightRoute("Krakow", "Warsaw"));
        this.flights.add(new FlightRoute("Warsaw", "Krakow"));
        this.flights.add(new FlightRoute("Krakow", "Bydgoszcz"));
        this.flights.add(new FlightRoute("Gdansk", "Bydgoszcz"));
        this.flights.add(new FlightRoute("Bydgoszcz", "Krakow"));
        this.flights.add(new FlightRoute("Gdansk", "Warsaw"));
        this.flights.add(new FlightRoute("Warsaw", "Gdansk"));
    }

    public List<FlightRoute> getFlights() {
        return flights;
    }
}
