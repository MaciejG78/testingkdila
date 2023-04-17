package com.example.labs.AppShapeCollector;

public class AppShapeCollector {
    public static void main(String[] args) {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(2));
        shapeCollector.addFigure(new Circle(1));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(9, 3));

        shapeCollector.showFigures();

    }
}
