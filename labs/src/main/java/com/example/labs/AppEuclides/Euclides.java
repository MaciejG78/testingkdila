package com.example.labs.AppEuclides;

public class Euclides {

//  a=48, b=12 => 1. 48-12=36 a=36, b=12; 2. 36-12=24 a=24, b=12; 24-12=12 a=12, b=12 -> a=b nwd = 12
//  a=9, b=33 => 1. 33-9=24 a=9, b=24; 2. 24-9=15 a=9, b=15; 3. 15-9=6 a=9, b=6; 4. 9-6=3 a=3, b=6; 5. 6-3=3 a=3, b=3 -> a=b nwd = 3
    public int nwd1(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public int nwd2(int a, int b) {
        int reszta;
        do {
            reszta = a % b; //48%12 = 0, a=12, b=0 nwd=12; 12%48=12, a=48, b=12
            if (reszta != 0) {
                a = b;
                b = reszta;
            }
        } while (reszta != 0);
        return b;
    }
}