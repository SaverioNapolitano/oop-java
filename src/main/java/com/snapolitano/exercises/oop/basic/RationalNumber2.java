package com.snapolitano.exercises.oop.basic;

import java.util.Objects;

public class RationalNumber2 {

	int denominator;
	int numerator;

	public RationalNumber2(int denominator, int numerator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator must be != 0");
		}
		this.denominator = denominator;
		this.numerator = numerator;
	}

	static int greatestCommonDivisor(int a, int b) {
		int max = Math.max(a, b);
		int min = Math.min(a, b);

		int rest = max % min;
		if (max % min == 0) {
			return min;
		} else {
			return greatestCommonDivisor(min, rest);
		}
	}

	static int leastCommonMultiple(int a, int b) {
		return Math.abs(a * b) / greatestCommonDivisor(a, b);
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public RationalNumber2 add(RationalNumber2 o) {
		int denominator = leastCommonMultiple(this.getDenominator(), o.getDenominator());
		int numerator =
				this.getNumerator() * denominator / this.getDenominator() + o.getNumerator() * denominator / o.getDenominator();
		int divisor;
		try {
			divisor = greatestCommonDivisor(denominator, numerator);
		} catch (ArithmeticException e) {
			divisor = denominator;
		}

		denominator /= divisor;
		numerator /= divisor;

		return new RationalNumber2(denominator, numerator);
	}

	public RationalNumber2 multiply(RationalNumber2 o) {
		int denominator = this.getDenominator() * o.getDenominator();
		int numerator = this.getNumerator() * o.getNumerator();
		int divisor;
		try {
			divisor = greatestCommonDivisor(denominator, numerator);
		} catch (ArithmeticException e) {
			divisor = denominator;
		}
		denominator /= divisor;
		numerator /= divisor;

		return new RationalNumber2(denominator, numerator);
	}

	@Override
	public int hashCode() {
		return Objects.hash(denominator, numerator);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		RationalNumber2 that = (RationalNumber2) o;
		return denominator == that.denominator && numerator == that.numerator;
	}

	@Override
	public String toString() {
		return "RationalNumber2{" + "denominator=" + denominator + ", numerator=" + numerator + '}';
	}
}
