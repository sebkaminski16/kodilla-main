package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<>();

    public int getFiguresSize() {
        return figures.size();
    }

    public boolean addFigure(Shape shape){
        return figures.add(shape);
    }
    public boolean removeFigure(Shape shape){
        return figures.remove(shape);
    }
    public Shape getFigure(int n){
        return figures.get(n);
    }
    public List showFigures(){
        return figures;
    }

}
