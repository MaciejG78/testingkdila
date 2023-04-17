package com.example.labs.AppLeapYearCalculator;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year = 2000;
        int month = 2;
        System.out.println(isLeapYear(year));
        System.out.println(getDaysInMonth(month, year));
    }

    //Metoda Gela orginalna
   /* public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 10000) {
            return false;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 != 0) {
            return false;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            return false;
        }
        return false;
    }*/

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
    }

    public static int getDaysInMonth(int month, int year) {
        if ((year <= 0 || year >= 10000) || (month < 1 || month > 12)) {
            return -1;
        } else return
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;
                    case 2 -> isLeapYear(year) ? 29 : 28;
                    default -> -1;
                };
    }
}

