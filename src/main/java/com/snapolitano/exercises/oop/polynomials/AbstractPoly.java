package com.snapolitano.exercises.oop.polynomials;

import java.util.Arrays;

public abstract class AbstractPoly implements Poly {

	@Override
	public double coefficient(int degree) {
		return coefficients()[degree];
	}

	@Override
	public int degree() {
		return coefficients().length - 1;
	}

	protected double[] derive() {
		double[] doubles = Arrays.copyOf(coefficients(), coefficients().length);
		for (int i = 0; i < doubles.length - 1; i++) {
			doubles[i] = doubles[i + 1] * (i + 1);
		}
		return Arrays.copyOf(doubles, doubles.length - 1);
	}

	public int hashCode() {
		return Arrays.hashCode(coefficients());
	}

	public boolean equals(Object o) {
		if (o instanceof Poly p) {
			return Arrays.equals(coefficients(), p.coefficients());
		}
		return false;
	}

	@Override
	public String toString() {
		return Arrays.toString(coefficients());
	}
}
