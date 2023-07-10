package com.snapolitano.exercises.oop.polynomials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayPolyTest {
	Poly p;

	@BeforeEach
	void setUp() {
		p = new ArrayPoly(new double[]{1, 2, 3, 4, 5});
	}

	@Test
	void coefficients() {
		assertArrayEquals(new double[]{1, 2, 3, 4, 5}, p.coefficients());
	}

	@Test
	void derivative() {
		assertArrayEquals(new double[]{2, 6, 12, 20}, p.derivative().coefficients());
	}
}