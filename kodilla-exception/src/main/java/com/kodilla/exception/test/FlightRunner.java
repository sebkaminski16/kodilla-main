package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {
        FlightFinder ff = new FlightFinder();
        Flight flight1 = new Flight("Airport 1", "Airport 2");
        Flight flight2 = new Flight("Airport 2", "Airport 3");
        Flight flight3 = new Flight("Airport 3", "Airport 4");

        try {
            ff.findFlight(flight1);
            ff.findFlight(flight2);
            ff.findFlight(flight3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ff.findFlight(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
