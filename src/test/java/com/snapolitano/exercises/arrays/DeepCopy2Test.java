package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

class DeepCopy2Test {

	@Test
	void deepCopy() {
		int[][] original = {{1, 2, 3}, {4, 5, 6}, {6, 7, 8}};
		int[][] deepCopy = DeepCopy2.deepCopy(original);
		assertNotSame(deepCopy[0], original[0]);
		assertNotSame(deepCopy[1], original[1]);
	}
}