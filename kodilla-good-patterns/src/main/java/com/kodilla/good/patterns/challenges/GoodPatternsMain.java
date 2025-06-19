package com.kodilla.good.patterns.challenges;

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
    }
}
