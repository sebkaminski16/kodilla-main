package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<>();

    public int getFiguresSize() {
        return figures.size();
    }

    public boolean addFigure(Shape shape){
        boolean result = false;
        if(figures.add(shape)) {
            result = true;
        };
        return result;
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(figures.remove(shape)) {
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        return figures.get(n);
    }
    public List showFigures(){
        return figures;
    }

}
