package com.snapolitano.exercises.arrays;

import java.util.Arrays;

public class DivideArray2 {

	public static double[] divideArray(double[] v, double factor) {
		return Arrays.stream(v).map(operand -> operand / factor).toArray();
	}
}
