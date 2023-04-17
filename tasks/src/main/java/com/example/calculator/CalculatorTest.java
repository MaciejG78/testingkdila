package com.example.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void add() {
        //given
        Calculator calculator = new Calculator();
        //when & then
        Assert.assertEquals(0, calculator.add(0, 0), 0);
        Assert.assertEquals(10.0, calculator.add(5.0, 5.0), 0);
        Assert.assertEquals(5.0, calculator.add(0, 5.0), 0);
        Assert.assertEquals(5.0, calculator.add(5.0, 0), 0);
    }

    @Test
    void substract() {
        //given
        Calculator calculator = new Calculator();
        //when & then
        Assert.assertEquals(0, calculator.substract(0, 0), 0);
        Assert.assertEquals(0, calculator.substract(5.0, 5.0), 0);
        Assert.assertEquals(-5.0, calculator.substract(0, 5.0), 0);
        Assert.assertEquals(5.0, calculator.substract(5.0, 0), 0);
    }

}