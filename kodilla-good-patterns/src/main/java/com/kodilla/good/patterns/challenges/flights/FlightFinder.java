package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FlightFinder {
    private final FlightDatabase flightDatabase = new FlightDatabase();

    public List<FlightRoute> findFlightsFrom(String cityName) {
        List<FlightRoute> flightsInDatabase = flightDatabase.getFlights();

        return flightsInDatabase.stream()
                .filter(flight -> flight.getCities().getFirst().equals(cityName)).toList();
    }

    public List<FlightRoute> findFlightsTo(String cityName) {
        List<FlightRoute> flightsInDatabase = flightDatabase.getFlights();

        return flightsInDatabase.stream()
                .filter(flight -> flight.getCities().getLast().equals(cityName)).toList();
    }

    public List<FlightRoute> findFlightsFromTo(String cityNameFrom, String cityNameTo) {
        List<FlightRoute> flightsInDatabase = flightDatabase.getFlights();

        List<FlightRoute> foundFlightsFromTo = flightsInDatabase.stream()
                .filter(flight -> flight.getCities().getFirst().equals(cityNameFrom) && flight.getCities().getLast().equals(cityNameTo)).toList();

        if(!foundFlightsFromTo.isEmpty()) return foundFlightsFromTo;

        List<FlightRoute> flightsFrom = this.findFlightsFrom(cityNameFrom);
        List<FlightRoute> finalFlights = new ArrayList<>();
        for(FlightRoute flightFrom : flightsFrom) {
            List<FlightRoute> flightsTo = this.findFlightsTo(cityNameTo);
            if(!flightsTo.isEmpty()) {
                for(FlightRoute flightTo : flightsTo) {
                    FlightRoute flyRoute = new FlightRoute(flightFrom.getCities().getFirst(), flightTo.getCities().getFirst(), flightTo.getCities().getLast());
                    if(!finalFlights.contains(flyRoute)) finalFlights.add(flyRoute);
                }
            }
        }

        return finalFlights;
    }
}
