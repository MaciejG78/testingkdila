package com.example.labs.AppOddNumbers;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddNumbersExterminatorTest {

    private static OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @BeforeEach
    void before(TestInfo testInfo) {
        System.out.println("------------- Start: " + testInfo.getDisplayName() + "(" + testInfo.getTestMethod().orElseThrow().getName() + ") ---------------------");
    }

    @AfterEach
    void after(TestInfo testInfo) {
        System.out.println("------------- Koniec: " + testInfo.getDisplayName() + " ---------------------\n");
    }

    @Test()
    @DisplayName("Test sprawdzający, czy klasa zachowuje się poprawnie, gdy lista jest pusta.")
    void testOddNumbersExterminatorEmptyList() {
        //GIVEN
        List<Integer> resultOddNumbers = Arrays.asList();
        List<Integer> numbers = Arrays.asList();
        //WHEN
        List<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);

        //THEN
        assertEquals(resultOddNumbers, oddNumbers);
    }

    @Test()
    @DisplayName("Test sprawdzający, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste.")
    void testOddNumbersExterminatorNormalList() {
        //GIVEN
        List<Integer> numbers = Arrays.asList(1, 4, 5, 7, 8, 9, 12, 13, 15, 101, 200, 201, 1000, 999, 9990);
        List<Integer> resultOddNumbers = Arrays.asList(4, 8, 12, 200, 1000, 9990);
        //WHEN
        List<Integer> oddNumbers = oddNumbersExterminator.exterminate(numbers);

        //THEN
        assertEquals(resultOddNumbers, oddNumbers);
    }

}