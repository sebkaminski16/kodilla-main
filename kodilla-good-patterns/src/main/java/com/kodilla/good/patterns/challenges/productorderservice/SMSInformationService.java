package com.kodilla.good.patterns.challenges.productorderservice;

public class SMSInformationService implements InformationService{
    @Override
    public void inform(Customer customer) {
        System.out.println("Sending SMS...");
        System.out.println("SMS sent!");
    }
}
