package com.snapolitano.exercises.oop.basic;

import com.snapolitano.exercises.oop.basic.Circle;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Point point = new Point(0, 0);
    Circle circle = new Circle(point, 1);

    @Test
    void getPerimeter() {
        assertEquals(2 * Math.PI, circle.getPerimeter());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI, circle.getArea());
    }

    @Test
    void contains() {
        Point p = new Point(1, 2);
        assertFalse(circle.contains(p));
    }

    @Test
    void translate() {
        circle.translate(1, 1);
        Point p = new Point(1, 1);
        assertEquals(p, circle.center);
    }
}