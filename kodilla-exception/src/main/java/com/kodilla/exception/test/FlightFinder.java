package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException, IllegalArgumentException {
        Map<String, Boolean> airportFlyableInfo = new HashMap<>();
        airportFlyableInfo.put("Airport 1", true);
        airportFlyableInfo.put("Airport 2", true);
        airportFlyableInfo.put("Airport 3", true);

        if(flight != null) {
            String arrivalAirport = flight.getArrivalAirport();
            String departureAirport = flight.getDepartureAirport();

            if (airportFlyableInfo.get(arrivalAirport) != null && airportFlyableInfo.get(departureAirport) != null && airportFlyableInfo.get(arrivalAirport) && airportFlyableInfo.get(departureAirport)) {
                System.out.println("Flight found!");
            } else {
                throw new RouteNotFoundException("Flight not found!");
            }
        } else {
            throw new IllegalArgumentException("Flight is null");
        }
    }
}
