package com.tesuso.kodilla;

import com.tesuso.kodilla.testing.calculator.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaApplication {


    public static void main(String[] args) {
        SpringApplication.run(KodillaApplication.class, args);

        Calculator calculator = new Calculator();
        if (calculator.add(5, 5) == 10) {
            System.out.println("Test for add 5 + 5: OK");
        } else {
            System.out.println("Test for add 5 + 5: ERROR");
        }

        if (calculator.substract(10, 10) == 0) {
            System.out.println("Test for add 10 - 10: OK");
        } else {
            System.out.println("Test for add 10 - 10: ERROR");
        }
    }

}
