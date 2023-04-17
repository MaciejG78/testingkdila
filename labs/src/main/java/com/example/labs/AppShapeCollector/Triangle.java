package com.example.labs.AppShapeCollector;

public class Triangle implements Shape {
    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String shapeName() {
        return "Trójkąt";
    }

    @Override
    public double surfaceArea() {
        return a * h / 2;
    }

    @Override
    public String toString() {
        return "Triangle - Name: " + shapeName() + ", Pole powierzchni: " + surfaceArea();
    }
}
