package com.example.labs.AppCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AppCalculatorTest {

    @Test()
    void twoPlusTwoShouldEqualsFour() {
        var calculator = new AppCalculator();
        assertEquals(4.00, calculator.add(2.00, 2.00));
    }

    @Test()
    void threePlusSevenShouldEqualsTen() {
        var calculator = new AppCalculator();
        assertEquals(10.00, calculator.add(3.00, 7.00));
    }

    @Test()
    void threePlusSevenShouldNotEqualsTwelve() {
        var calculator = new AppCalculator();
        assertNotEquals(20.00, calculator.add(3.00, 7.00));
    }

    @Test()
    void ninetyNineMinusNineShouldEqualsNinety() {
        var calculator = new AppCalculator();
        assertEquals(90.00, calculator.minus(99.00, 9.00));
    }

    @Test()
    void sevenMultiplyTenShouldEqualsSeventy() {
        var calculator = new AppCalculator();
        assertEquals(70.00, calculator.multiply(7.00, 10.00));
    }

    @Test()
    void ninetyNineDivideByNineShouldEqualsEleven() {
        var calculator = new AppCalculator();
        assertEquals(11.00, calculator.divide(99.00, 9.00));
    }


}