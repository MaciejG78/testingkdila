package com.tesuso.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTest {

    @Test
    void testForProbablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 5)),
                () -> assertEquals("Done!", secondChallenge.probablyIWillThrowException(1, 5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1, 5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5))
        );
    }
}