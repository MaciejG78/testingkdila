package com.example.labs.AppFirstJUnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test()
    void add() {
        //GIVEN

        //WHEN
        int resultAdd1 = calculator.add(123, 27);
        int resultAdd2 = calculator.add(1000, 999);
        int resultAdd3 = calculator.add(0, 0);
        //THEN
        assertEquals(150, resultAdd1);
        assertEquals(1999, resultAdd2);
        assertEquals(0, resultAdd3);
    }

    @Test()
    void subtract() {
        //GIVEN

        //WHEN
        int resultSubtract1 = calculator.subtact(127, 27);
        int resultSubtract2 = calculator.subtact(0, 0);
        int resultSubtract3 = calculator.subtact(100, 200);
        //THEN
        assertEquals(100, resultSubtract1);
        assertEquals(0, resultSubtract2);
        assertEquals(-100, resultSubtract3);
    }

}