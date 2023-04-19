package com.snapolitano.exercises.oop.shape;

import java.awt.*;

public class Circle extends AbstractShape {
    Point center;
    double radius;

    public Circle(String color, String id, Point center, double radius) {
        super(color, id);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + ", color='" + color + '\'' + ", id='" + id + '\'' + '}';
    }

    @Override
    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public void move(Point movement) {
        center = this.getCenter();
        center.setLocation(center.getX() + movement.getX(), center.getY() + movement.getY());
        this.setCenter(center);
    }

    @Override
    public void resize(double scale) {
        radius *= scale;
    }
}
