package com.example;

public class ConditionsStatements {

    Integer x;
    Integer y;

    public ConditionsStatements() {
    }

    String comparingIfXBiggerThanY(Integer x, Integer y) {
        if (x > y) {
            return "x > y";
        }
        if (x < y) {
            return "x < y";
        } else return " x = y ";
    }

    String comparingShortIfXBiggerThanY(Integer x, Integer y) {
        return (x > y) ? "x > y" : ((x < y) ? "x < y" : "x = y");
    }
}
