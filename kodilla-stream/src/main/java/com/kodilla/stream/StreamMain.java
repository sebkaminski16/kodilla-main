package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}