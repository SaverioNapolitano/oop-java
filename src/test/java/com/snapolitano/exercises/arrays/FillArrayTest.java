package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FillArrayTest {

	@Test
	void fillArray() {
		assertArrayEquals(new double[]{0, 0, 0}, FillArray.fillArray(3, 0, false));
	}
}