package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FillArray2Test {

	@Test
	void fillArray() {
		assertArrayEquals(new double[]{0, 0, 0}, FillArray2.fillArray(3, 0, false));
		assertArrayEquals(new double[]{1, 1, 1, 1, 1}, FillArray2.fillArray(5, 1, false));
	}
}