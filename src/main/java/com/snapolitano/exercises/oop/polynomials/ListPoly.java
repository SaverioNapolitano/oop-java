package com.snapolitano.exercises.oop.polynomials;

import java.util.ArrayList;

public class ListPoly extends AbstractPoly {
	ArrayList<Double> coefficients;

	public ListPoly(double[] coefficients) {
		this.coefficients = new ArrayList<>();
		for (double coefficient : coefficients) {
			this.coefficients.add(coefficient);
		}
	}

	@Override
	public double[] coefficients() {
		double[] coefficients = new double[this.coefficients.size()];
		for (int i = 0; i < coefficients.length; i++) {
			coefficients[i] = this.coefficients.get(i);
		}
		return coefficients;
	}

	@Override
	public Poly derivative() {
		return new ListPoly(derive());
	}
}
