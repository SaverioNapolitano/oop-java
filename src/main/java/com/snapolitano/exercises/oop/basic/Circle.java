package com.snapolitano.exercises.oop.basic;

import java.awt.*;

public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public boolean contains(Point point) {
        return (Math.pow(point.x, 2) + Math.pow(point.y, 2)) <= Math.pow(this.radius, 2);
    }

    public void translate(int dx, int dy) {
        this.center.x += dx;
        this.center.y += dy;
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
}
