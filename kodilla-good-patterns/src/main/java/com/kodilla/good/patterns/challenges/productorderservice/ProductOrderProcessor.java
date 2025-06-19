package com.kodilla.good.patterns.challenges.productorderservice;

import java.time.LocalDateTime;
import java.util.Optional;

public class ProductOrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderProcessor(final InformationService is, final OrderService os, final OrderRepository or) {
        this.informationService = is;
        this.orderService = os;
        this.orderRepository = or;
    }

    public Optional<ProductOrderDto> process(final OrderRequest orderRequest) {
        boolean ordered = orderService.order(orderRequest.getCustomer(), orderRequest.getItem());
        if(ordered) {
            LocalDateTime date = LocalDateTime.now();
            this.informationService.inform(orderRequest.getCustomer());
            this.orderRepository.createOrder(orderRequest.getCustomer(), orderRequest.getItem(), date);
            return Optional.of(new ProductOrderDto(orderRequest.getCustomer(), date));
        } else {
            return Optional.empty();
        }
    }
}
