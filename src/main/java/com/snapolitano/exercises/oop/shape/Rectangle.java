package com.snapolitano.exercises.oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
    Point upperLeft;
    Point bottomRight;

    public Rectangle(String color, String id, Point upperLeft, Point bottomRight) {
        super(color, id);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "bottomRight=" + bottomRight + ", upperLeft=" + upperLeft + ", color='" + color + '\'' + ", id='" + id + '\'' + '}';
    }

    @Override
    public double getArea() {
        Point bottomLeft = new Point(upperLeft.x, bottomRight.y);
        Point upperRight = new Point(bottomRight.x, upperLeft.y);
        double a = Math.abs(upperLeft.getX() - upperRight.getY());
        double b = Math.abs(upperLeft.getY() - bottomLeft.getY());
        return a * b;
    }

    @Override
    public double getPerimeter() {
        Point bottomLeft = new Point(upperLeft.x, bottomRight.y);
        Point upperRight = new Point(bottomRight.x, upperLeft.y);
        double a = Math.abs(upperLeft.getX() - upperRight.getY());
        double b = Math.abs(upperLeft.getY() - bottomLeft.getY());
        return 2 * (a + b);
    }

    @Override
    public void move(Point movement) {
        upperLeft.setLocation(upperLeft.getX() + movement.getX(), upperLeft.getY() + movement.getY());
        bottomRight.setLocation(bottomRight.getX() + movement.getX(), bottomRight.getY() + movement.getY());
    }

    @Override
    public void resize(double scale) {
        //TODO: resize
        upperLeft.setLocation(upperLeft.getX() * scale, upperLeft.getY() * scale);
        bottomRight.setLocation(bottomRight.getX() * scale, bottomRight.getY() * scale);
    }
}
