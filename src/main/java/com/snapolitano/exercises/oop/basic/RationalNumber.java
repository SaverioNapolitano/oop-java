package com.snapolitano.exercises.oop.basic;

import java.util.Objects;

public class RationalNumber {

    int denominator;
    int numerator;

    public RationalNumber(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public RationalNumber add(RationalNumber other) {
        int newNumerator1 = this.numerator * other.denominator;
        int newNumerator2 = this.denominator * other.numerator;
        return new RationalNumber(newNumerator1+newNumerator2, this.denominator*other.denominator);
    }

    public RationalNumber multiply(RationalNumber other) {
        return new RationalNumber(this.numerator* other.numerator, this.denominator*other.denominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{" + "denominator=" + denominator + ", numerator=" + numerator + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        RationalNumber that = (RationalNumber) o;
        return denominator == that.denominator && numerator == that.numerator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denominator, numerator);
    }
}
