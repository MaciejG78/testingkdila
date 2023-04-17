package com.example.labs.AppShapeCollector;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
        System.out.println("Dodano figurę: " + shape.shapeName());
    }

    public boolean removeFigure(Shape shape) {
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            System.out.println("Usunięto figurę: " + shape.shapeName());
            return true;
        } else {
            System.out.println("Brak figury: " + shape.shapeName());
            return false;
        }
    }

    public Shape getFigure(int n) {
        if (n < 0 || shapes.size() < (n + 1)) {
            return null;
        } else {
            return shapes.get(n);
        }
    }

    public void showFigures() {
        System.out.println(shapes.toString());
    }
}
