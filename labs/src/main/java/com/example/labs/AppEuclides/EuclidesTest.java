package com.example.labs.AppEuclides;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuclidesTest {

    @Test
    void nwd1() {
        //GIVEN
        Euclides euclides = new Euclides();

        //WHEN
        int result1 = euclides.nwd1(48, 12);
        int result2 = euclides.nwd1(9, 33);
        int result3 = euclides.nwd1(162, 45);

        //THEN
        assertEquals(12, result1);
        assertEquals(3, result2);
        assertEquals(9, result3);
    }

    @Test
    void nwd2() {
        //GIVEN
        Euclides euclides = new Euclides();

        //WHEN
        int result1 = euclides.nwd2(48, 12);
        int result2 = euclides.nwd2(9, 33);
        int result3 = euclides.nwd2(162, 45);

        //THEN
        assertEquals(12, result1);
        assertEquals(3, result2);
        assertEquals(9, result3);
    }
}