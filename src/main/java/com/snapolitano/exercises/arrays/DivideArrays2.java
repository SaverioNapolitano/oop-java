package com.snapolitano.exercises.arrays;

public class DivideArrays2 {

	public static double[] divideArrays(double[] v1, double[] v2) {
		if (v1.length != v2.length) {
			return null;
		}
		for (int i = 0; i < v1.length; i++) {
			v1[i] /= v2[i];
		}
		return v1;
	}
}
