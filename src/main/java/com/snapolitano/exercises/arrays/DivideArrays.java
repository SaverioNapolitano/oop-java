package com.snapolitano.exercises.arrays;

public class DivideArrays {
	public static double[] divideArrays(double[] v1, double[] v2) {
		if (v1.length != v2.length)
			return null;
		double[] dividedArray = new double[v1.length];
		for (int i = 0; i < v1.length; i++) {
			dividedArray[i] = v1[i] / v2[i];
		}
		return dividedArray;
	}
}
