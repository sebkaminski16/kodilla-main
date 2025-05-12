package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void beforeEach() {
        System.out.println("Test case: start");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("Test case: end");
    }
    @DisplayName(
            "When passed an argument of EMPTY Integer List, " +
                    "it should return that empty list"
    )
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> exterminatedNumbers = new OddNumbersExterminator().exterminate(new ArrayList<>());
        //When
        List<Integer> expected = new ArrayList<>();
        //Then
        Assertions.assertEquals(expected, exterminatedNumbers);
    }
    @DisplayName("When passed an argument of Integer List," +
            "filled with odd and even numbers, it should return" +
            " a list ONLY with even numbers")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        List<Integer> exterminatedNumbers = new OddNumbersExterminator().exterminate(numbers);
        //When
        List<Integer> expected = new ArrayList<>();
        for(int i = 0; i < 20; i+=2) {
            expected.add(i);
        }
        //Then
        Assertions.assertEquals(expected, exterminatedNumbers);
    }
}
