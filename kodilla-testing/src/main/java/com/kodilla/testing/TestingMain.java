package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Test 1: metoda \"subtract\" klasy Calculator:");
        int result = calculator.subtract(2, 1);
        System.out.println(result == 1 ? "OK" : "FAILED");

        System.out.println("--------------------------------------------");

        System.out.println("Test 2: metoda \"add\" klasy Calculator:");
        result = calculator.add(2, 1);
        System.out.println(result == 3 ? "OK" : "FAILED");
    }
}