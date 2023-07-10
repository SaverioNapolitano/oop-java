package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DivideArraysTest {

	@Test
	void divideArrays() {
		assertArrayEquals(new double[]{0.2, 0.1, 0.1}, DivideArrays.divideArrays(new double[]{2, 1, 1}, new double[]{
				10, 10, 10
		}));
		assertArrayEquals(new double[]{2, 2}, DivideArrays.divideArrays(new double[]{10, 10}, new double[]{5, 5}));
	}
}