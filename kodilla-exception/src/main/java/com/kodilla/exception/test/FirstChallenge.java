package com.kodilla.exception.test;

// Dodatkowe zadania zrobie w niedalekiej przyszlosci :)

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (RuntimeException re) {
            System.out.println("Nie ma dzielenia przez zero :)");
        } finally {
            System.out.println("Wykonales operacje mnozenia");
        }
    }
}