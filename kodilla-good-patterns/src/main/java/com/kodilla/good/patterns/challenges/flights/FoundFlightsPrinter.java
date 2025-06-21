package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class FoundFlightsPrinter {

    private void printTitle(String title) {
        System.out.printf("------ %s ------", title.toUpperCase());
        System.out.println();
    }

    public void printFlights(List<FlightRoute> flights, String label) {
        this.printTitle(label);

        for(FlightRoute flightRoute : flights) {
            System.out.println(flightRoute.getCities());
        }
        System.out.println();
    }
}
