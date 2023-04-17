package com.example.labs.AppSumRace;

import java.util.Random;

public class AppSumRace {
    public static void main(String[] args) {
        int sumaA = 1000;
        int sumaB = 0;

        while (sumaA > sumaB) {
            Random randomA = new Random();
            sumaA += randomA.nextInt(10);
            System.out.println("SumaA: " + sumaA);

            Random randomB = new Random();
            sumaB += randomB.nextInt(50);
            System.out.println("SumaB: " + sumaB);
        }

    }
}
