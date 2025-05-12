package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "A square";
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(side, square.side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(side);
    }
}
