package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        int[] nums = new int[20];
        for(int i = 0; i < 20; i++) nums[i] = 2;
        double result = ArrayOperations.getAverage(nums);

        Assertions.assertEquals(2.0, result);
    }
}
