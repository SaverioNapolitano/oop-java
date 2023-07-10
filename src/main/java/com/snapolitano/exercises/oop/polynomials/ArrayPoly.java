package com.snapolitano.exercises.oop.polynomials;

public class ArrayPoly extends AbstractPoly {

	double[] coefficients;

	public ArrayPoly(double[] coefficients) {
		this.coefficients = coefficients;
	}

	@Override
	public double[] coefficients() {
		return coefficients;
	}

	@Override
	public Poly derivative() {
		return new ArrayPoly(derive());
	}
}
