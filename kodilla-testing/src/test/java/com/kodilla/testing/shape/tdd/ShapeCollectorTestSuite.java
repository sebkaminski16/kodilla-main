package com.kodilla.testing.shape.tdd;

import com.kodilla.testing.shape.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@DisplayName("ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {
    @DisplayName("Write operations tests")
    @Nested
    class ShapeWriteOperations {
        @DisplayName("When added a Shape to the list of 0 items, " +
                "the size of the list should be equal to 1")
        @Test
        public void testAddsFigureToList() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(4);
            //When
            shapeCollector.addFigure(circle);
            //Then
            int result = shapeCollector.getFiguresSize();
            int expected = 1;
            Assertions.assertEquals(1, result);
        }

        @DisplayName("When removed a Shape from the list of 1 item, " +
                "the size of the list should be equal to 1")
        @Test
        public void testRemoveFigureFromList() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(2);
            shapeCollector.addFigure(square);
            //When
            shapeCollector.removeFigure(square);
            //Then
            int result = shapeCollector.getFiguresSize();
            int expected = 0;
            Assertions.assertEquals(0, result);
        }
    }

    @DisplayName("Read operations tests")
    @Nested
    class ShapeReadOperations {
        @DisplayName("When retrieving an item from the list based on index passed," +
                "it should return an item of that exact index")
        @Test
        public void testRetrieveFigureFromList() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(4);
            Shape triangle = new Triangle(2, 4);
            Shape circle = new Circle(4.3);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            //When
            Shape retrievedShape = shapeCollector.getFigure(1);
            //Then
            Assertions.assertEquals(triangle, retrievedShape);
        }

        @DisplayName("When retrieving an item from the list based on index passed," +
                "it should return an item of that exact index")
        @Test
        public void testRetrieveFigureList() {
            //Given
            List<Shape> figureList = new ArrayList<>();
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(4);
            Shape triangle = new Triangle(2, 4);
            Shape circle = new Circle(4.3);
            figureList.add(square);
            figureList.add(triangle);
            figureList.add(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            //When
            List<Shape> retrievedFigureList = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(figureList, retrievedFigureList);
        }
    }
}
