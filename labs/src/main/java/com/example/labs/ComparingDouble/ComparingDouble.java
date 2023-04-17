package com.example.labs.ComparingDouble;

public class ComparingDouble {

    public static void main(String[] args) {
        double a = 41.7785432;
        double b = 41.67864322;

        System.out.println("Compare to 3 decimal places: " + a + " = " + b + " => " + compare(a , b));
        System.out.println("Test");
    }

    public static boolean compare(double a, double b) {
        return (Math.floor((a*1000)/1) == Math.floor((b*1000)/1));
    }

}
