package com.kodilla.good.patterns.challenges;

import java.util.List;

public class GoodPatternsMain {
    public static void main(String[] args) {
        //task 1
        MovieStore ms = new MovieStore();
        ms.getMovies().values().stream().flatMap(List::stream).forEach(translatedTitle -> System.out.printf("%s! ", translatedTitle));

        //task 2
        FactorialCalculator fc = new FactorialCalculator();
        System.out.println(fc.calculate(3));
    }
}
