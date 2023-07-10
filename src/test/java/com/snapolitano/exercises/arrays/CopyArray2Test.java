package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CopyArray2Test {

	@Test
	void copyArray() {
		assertArrayEquals(new double[]{1, 2, 3}, CopyArray2.copyArray(new double[]{1, 2, 3}));
		assertArrayEquals(new double[]{2, 1, 1}, CopyArray2.copyArray(new double[]{2, 1, 1}));
	}
}