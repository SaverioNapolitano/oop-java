package com.snapolitano.exercises.exceptions;

public class DivisionSquared {
	public static int divisionSquared(int a, int b) {
		int r = 0;
		try {
			r = (a / b) * (a / b);
		} catch (ArithmeticException e) {
			return r;
		}
		return r;
	}
}
