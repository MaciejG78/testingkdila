package com.example.stream.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        //Given
        int numbers [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        double averageExpected = 10.0;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(averageExpected, average, 0.1);
    }

}
