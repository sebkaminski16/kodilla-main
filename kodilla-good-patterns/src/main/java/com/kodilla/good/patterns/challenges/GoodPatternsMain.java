package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.flights.FlightFinder;
import com.kodilla.good.patterns.challenges.flights.FlightRoute;
import com.kodilla.good.patterns.challenges.flights.FoundFlightsPrinter;
import com.kodilla.good.patterns.challenges.food2door.FoodOrderingSystem;
import com.kodilla.good.patterns.challenges.food2door.HealthyShop;
import com.kodilla.good.patterns.challenges.productorderservice.*;

import java.util.List;
import java.util.Optional;

public class GoodPatternsMain {
    public static void main(String[] args) {
        //task 1
        MovieStore ms = new MovieStore();
        ms.getMovies().values().stream().flatMap(List::stream).forEach(translatedTitle -> System.out.printf("%s! ", translatedTitle));

        //task 2
        FactorialCalculator fc = new FactorialCalculator();
        System.out.println(fc.calculate(3));

        //task 3
        Customer customerSebastian = new Customer("Sebastian", "K", "Warsaw");
        Item tv = new Item("TV", 2199.99);

        ProductOrderProcessor pos = new ProductOrderProcessor(new SMSInformationService(), new AllegroOrderService(), new SQLOrderRepository());
        OrderRequest tvOrderRequest = new OrderRequest(customerSebastian, tv);

        Optional<ProductOrderDto> productOrderDto = pos.process(tvOrderRequest);
        productOrderDto.ifPresentOrElse((dto) -> System.out.printf("Order to %s, %s will come soon!",
                dto.getCustomer().getName(), dto.getCustomer().getLocation()),
                () -> System.out.println("No product order..."));

        System.out.println();
        System.out.println();

        //task 4
        FoodOrderingSystem fos = new FoodOrderingSystem();
        //fos.order(new HealthyShop("Healthy Shop"));

        //task 5
        FlightFinder flightFinder = new FlightFinder();
        FoundFlightsPrinter foundFlightsPrinter = new FoundFlightsPrinter();

        List<FlightRoute> flightsFrom = flightFinder.findFlightsFrom("Krakow");
        List<FlightRoute> flightsTo = flightFinder.findFlightsTo("Krakow");
        List<FlightRoute> flightsFromTo = flightFinder.findFlightsFromTo("Warsaw", "Bydgoszcz");

        foundFlightsPrinter.printFlights(flightsFrom, "Flights from Krakow");
        foundFlightsPrinter.printFlights(flightsTo, "Flights to Krakow");
        foundFlightsPrinter.printFlights(flightsFromTo, "Flights from Warsaw to Bydgoszcz");

    }
}
