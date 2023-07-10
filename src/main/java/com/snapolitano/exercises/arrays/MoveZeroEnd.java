package com.snapolitano.exercises.arrays;

public class MoveZeroEnd {

	public static int[] moveZerosEnd(int[] v) {
		int[] output = new int[v.length];
		int j = 0;
		for (int k : v) {
			if (k != 0) {
				output[j] = k;
				j++;
			}
		}
		return output;
	}
}
