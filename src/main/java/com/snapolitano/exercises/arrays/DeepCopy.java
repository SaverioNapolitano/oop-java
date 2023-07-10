package com.snapolitano.exercises.arrays;

import java.util.Arrays;

public class DeepCopy {
	public static int[][] deepCopy(int[][] original) {
		int[][] dst = new int[original.length][];
		for (int i = 0; i < original.length; i++) {
			dst[i] = Arrays.copyOf(original[i], original[i].length);
		}
		return dst;
	}
}
