package com.snapolitano.exercises.arrays;

public class Fibonacci {
	public static long[] fibonacci(int n) {
		long[] fibonacci = new long[n];
		if (n == 1)
			return fibonacci;
		fibonacci[1] = 1;
		for (int i = 2; i < n; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		return fibonacci;
	}
}
