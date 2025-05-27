package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondChallengeTestSuite {
    @Test
    public void testProbablyIWillThrowException() {
        //given
        SecondChallenge sc = new SecondChallenge();
        Class<Exception> ec = Exception.class;
        //when & then
        Assertions.assertAll(
                () -> Assertions.assertThrows(ec, () -> sc.probablyIWillThrowException(2, 50)),
                () -> Assertions.assertThrows(ec, () -> sc.probablyIWillThrowException(3, 50)),
                () -> Assertions.assertThrows(ec, () -> sc.probablyIWillThrowException(0, 50)),
                () -> Assertions.assertThrows(ec, () -> sc.probablyIWillThrowException(50, 1.5)),
                () -> Assertions.assertDoesNotThrow(() -> sc.probablyIWillThrowException(1, 50)),
                () -> Assertions.assertDoesNotThrow(() -> sc.probablyIWillThrowException(1, 0))
        );
    }
}
