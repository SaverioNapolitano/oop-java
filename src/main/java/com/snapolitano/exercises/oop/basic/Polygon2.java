package com.snapolitano.exercises.oop.basic;

import java.awt.*;
import java.util.Arrays;

public class Polygon2 {
    Point[] vertices;

    public Polygon2(Point[] vertices) {
        this.vertices = vertices;
    }

    public double getArea(){
        double area = 0;
        for(int i = 0; i < vertices.length - 1; i++){
            area += vertices[i+1].getX()*vertices[i].getY() - vertices[i+1].getY()*vertices[i].getX();
        }

        return Math.abs(area/2);
    }

    public double getPerimeter(){
        double perimeter = 0;
        for(int i = 0; i < vertices.length; i++){
            perimeter += vertices[(i+1) % vertices.length].distance(vertices[i]);
        }
        return perimeter;
    }

    public int getVerticesCount(){
        return vertices.length;
    }

    @Override
    public String toString() {
        return "Polygon2{" + "vertices=" + Arrays.toString(vertices) + '}';
    }
}
