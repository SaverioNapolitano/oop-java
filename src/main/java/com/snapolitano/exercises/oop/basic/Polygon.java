package com.snapolitano.exercises.oop.basic;

import java.awt.*;
import java.util.Arrays;

public class Polygon {
    Point[] vertices;

    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    public int getVerticesCount() {
        return vertices.length;
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i = 1; i < vertices.length; i++) {
            perimeter += Math.sqrt(Math.pow(vertices[i - 1].x - vertices[i].x, 2) + Math.pow(vertices[i - 1].y - vertices[i].y, 2));
        }

        return perimeter + Math.sqrt(Math.pow(vertices[0].x - vertices[vertices.length - 1].x, 2) + Math.pow(vertices[0].y - vertices[vertices.length - 1].y, 2));
    }

    public double getArea() {
        double area = 0;
        for (int i = 0; i < vertices.length - 1; i++) {
            area += vertices[i + 1].x * vertices[i].y - vertices[i + 1].y * vertices[i].x;
        }
        return Math.abs(area) / 2;
    }

    @Override
    public String toString() {
        return "Polygon{" + "vertices=" + Arrays.toString(vertices) + '}';
    }
}
