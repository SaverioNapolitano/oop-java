package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Polygon2Test {

	Polygon2 polygon2;
	Polygon triangle;

	@BeforeEach
	void setUp() {
		polygon2 = new Polygon2(new Point[]{
				new Point(0, 0),
				new Point(0, 10),
				new Point(10, 10),
				new Point(10, 0)
		});
		triangle = new Polygon(new Point[]{new Point(0, 0), new Point(10, 0), new Point(5, 10)});
	}

	@Test
	void getArea() {
		assertEquals(100, polygon2.getArea());
		assertEquals(50, triangle.getArea());
	}

	@Test
	void getPerimeter() {
		assertEquals(40, polygon2.getPerimeter());
		assertEquals(32.3606797749979, triangle.getPerimeter());
	}

	@Test
	void getVerticesCount() {
		assertEquals(4, polygon2.getVerticesCount());
		assertEquals(3, triangle.getVerticesCount());
	}
}