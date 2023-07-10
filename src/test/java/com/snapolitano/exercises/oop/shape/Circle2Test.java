package com.snapolitano.exercises.oop.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Circle2Test {
	Circle2 circle2;

	@BeforeEach
	void setUp() {
		circle2 = new Circle2("1", "#0099CC", new Point(1, 1), 2);
	}

	@Test
	void getArea() {
		assertEquals(4 * Math.PI, circle2.getArea());
	}

	@Test
	void getPerimeter() {
		assertEquals(4 * Math.PI, circle2.getPerimeter());
	}

	@Test
	void move() {
		circle2.move(new Point(1, 1));
		assertEquals(new Point(2, 2), circle2.getCenter());
	}

	@Test
	void resize() {
		circle2.resize(2);
		assertEquals(1, circle2.getRadius());
	}
}