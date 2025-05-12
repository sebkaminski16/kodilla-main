package com.kodilla.testing.shape;

import java.util.Objects;

//
public class Triangle implements Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String getName() {
        return "A triangle";
    }

    @Override
    public double getArea() {
        return (this.side * this.height) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(side, triangle.side) == 0 && Double.compare(height, triangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, height);
    }
}

