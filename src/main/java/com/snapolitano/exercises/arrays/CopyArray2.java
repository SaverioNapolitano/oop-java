package com.snapolitano.exercises.arrays;

import java.util.Arrays;

public class CopyArray2 {
	public static double[] copyArray(double[] v) {
		return Arrays.copyOf(v, v.length);
	}
}
