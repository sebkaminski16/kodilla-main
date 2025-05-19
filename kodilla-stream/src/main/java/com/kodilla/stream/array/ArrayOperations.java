package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers) {
        int[] sortedArray = Arrays.stream(numbers).sorted().toArray();
        IntStream.range(0, sortedArray.length).forEach(element -> System.out.println(sortedArray[element]));
        return IntStream.range(sortedArray[0], sortedArray[sortedArray.length - 1] + 1).average().getAsDouble();
    };
}
