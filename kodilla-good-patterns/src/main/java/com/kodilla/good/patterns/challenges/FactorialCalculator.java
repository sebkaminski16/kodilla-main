package com.kodilla.good.patterns.challenges;

import java.util.stream.Stream;

public class FactorialCalculator {
    public int calculate(int number) {
        if(number < 0) throw new IllegalArgumentException("Do not provide numbers less than 0");
        if(number == 0) return 1;
        int result = number;
        while(number > 1) {
            number -= 1;
            result *= number;
        }
        return result;
    };
}
