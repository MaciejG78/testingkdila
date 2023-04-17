package com.example.labs.AppShapeCollector;

public class Square implements Shape {
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String shapeName() {
        return "Kwadrat";
    }

    @Override
    public double surfaceArea() {
        return Math.pow(a, 2);
    }

    @Override
    public String toString() {
        return "Square - Name: " + shapeName() + ", Pole powierzchni: " + surfaceArea();
    }
}
