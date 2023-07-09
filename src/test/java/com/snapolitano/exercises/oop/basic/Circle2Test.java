package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    Circle2 circle2 = new Circle2(new Point(1, 2), 2);

    @Test
    void getArea() {
        assertEquals(4*Math.PI, circle2.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(4*Math.PI, circle2.getPerimeter());
    }

    @Test
    void translate() {
        circle2.translate(1, 1);
        assertEquals(new Point(2, 3), circle2.getCenter());
    }

    @Test
    void contains(){
        assertFalse(circle2.contains(new Point(100, -100)));
    }
}