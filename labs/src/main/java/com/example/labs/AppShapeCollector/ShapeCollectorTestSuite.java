package com.example.labs.AppShapeCollector;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCollectorTestSuite {

    @Test
    void addFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1, shapeCollector.getShapes().size());
    }

    @Test
    void removeFigureWhichExist() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapes().size());
    }

    @Test
    void removeFigureWhichNotExist() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(4);
        shapeCollector.addFigure(shape1);
        Shape shape2 = new Square(5);
        //When
        boolean result = shapeCollector.removeFigure(shape2);
        //Then
        assertFalse(result);
        assertEquals(1, shapeCollector.getShapes().size());
    }

    @Test
    void getFigureWhichExist() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        assertEquals(shape, shapeResult);
    }

    @Test
    void getFigureWhichNotExist() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Shape shapeResult = shapeCollector.getFigure(0);
        //Then
        assertNull(shapeResult);
    }

    @Test
    void showFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(4);
        Shape triangle = new Triangle(2, 3);
        Shape circle = new Circle(2);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        ArrayList<Shape> shapeListExpectedResult = new ArrayList<>();
        shapeListExpectedResult.addAll(Arrays.asList(square, triangle, circle));
        String shapeListExpectedResultToString = "[Square - Name: Kwadrat, Pole powierzchni: 16.0, Triangle - Name: Trójkąt, Pole powierzchni: 3.0, Circle - Name: Okrąg, Pole powierzchni: 12.566370614359172]";
        //When
        List<Shape> shapeResultList = shapeCollector.getShapes();
        //Then
        assertEquals(shapeListExpectedResult.toString(), shapeResultList.toString());
        assertEquals(shapeListExpectedResultToString, shapeResultList.toString());
        assertArrayEquals(shapeListExpectedResult.toArray(), shapeCollector.getShapes().toArray());
    }
}