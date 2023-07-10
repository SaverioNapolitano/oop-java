package com.snapolitano.exercises.oop.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Rectangle2Test {

	Rectangle2 rectangle2;

	@BeforeEach
	void setUp() {
		rectangle2 = new Rectangle2("1", "#0099CC", new Point(0, 10), new Point(20, 0));
	}

	@Test
	void getArea() {
		assertEquals(200, rectangle2.getArea());
	}

	@Test
	void getPerimeter() {
		assertEquals(60, rectangle2.getPerimeter());
	}

	@Test
	void move() {
		rectangle2.move(new Point(10, 10));
		assertEquals(new Point(10, 20), rectangle2.getUpperLeft());
		assertEquals(new Point(30, 10), rectangle2.getBottomRight());
	}

	@Test
	void resize() {
		rectangle2.resize(2);
		assertEquals(new Point(40, 30), rectangle2.getBottomRight());
	}
}