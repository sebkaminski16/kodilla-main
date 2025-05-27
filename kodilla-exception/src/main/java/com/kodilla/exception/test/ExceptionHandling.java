package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge sc = new SecondChallenge();
        int calculationsMade = 0;
        try {
            sc.probablyIWillThrowException(0, 1.5);
        } catch(Exception e) {
            System.out.println("nieprawidłowe liczby");
        } finally {
            calculationsMade += 1;
        }
        System.out.printf("Liczba wykonanych obliczen: %d", calculationsMade);
    }
}
