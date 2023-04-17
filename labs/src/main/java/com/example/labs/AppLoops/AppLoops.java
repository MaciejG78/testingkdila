package com.example.labs.AppLoops;

public class AppLoops {
    public static void main(String[] args) {

        // Wypisz liczby od 0 - 10

        System.out.println("Sposób 1 pętla while:");
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


        System.out.println("Sposób 2 pętla do while:");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);


        System.out.println("Sposób 3 pętla for:");
        for (int k = 0; k <= 10; k++) {
            System.out.println(k);
        }


    }
}
