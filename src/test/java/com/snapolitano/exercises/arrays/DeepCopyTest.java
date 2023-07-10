package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;

class DeepCopyTest {

	@Test
	void deepCopy() {
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
		int[][] deepCopy = DeepCopy.deepCopy(matrix);
		assertNotSame(deepCopy[0], matrix[0]);
		assertNotSame(deepCopy[1], matrix[1]);
	}
}