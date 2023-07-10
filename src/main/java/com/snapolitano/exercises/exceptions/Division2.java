package com.snapolitano.exercises.exceptions;

public class Division2 {
	public static double division(double a, double b) {
		if (b == 0) {
			throw new IllegalArgumentException("/ by zero");
		}
		return a / b;
	}
}
