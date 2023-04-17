package com.example.labs.AppShapeCollector;

public class Circle implements Shape {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String shapeName() {
        return "Okrąg";
    }

    @Override
    public double surfaceArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Circle - Name: " + shapeName() + ", Pole powierzchni: " + surfaceArea();
    }

}
