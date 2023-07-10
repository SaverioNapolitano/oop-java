package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Fibonacci2Test {

	@Test
	void fibonacci() {
		assertArrayEquals(new long[]{0}, Fibonacci2.fibonacci(1));
		assertArrayEquals(new long[]{0, 1}, Fibonacci2.fibonacci(2));
		assertArrayEquals(new long[]{0, 1, 1, 2, 3}, Fibonacci2.fibonacci(5));
		assertArrayEquals(new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21}, Fibonacci2.fibonacci(9));
	}
}