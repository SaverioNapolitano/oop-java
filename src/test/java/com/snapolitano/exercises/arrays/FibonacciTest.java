package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FibonacciTest {

	@Test
	void fibonacci() {
		assertArrayEquals(new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, Fibonacci.fibonacci(10));
	}
}