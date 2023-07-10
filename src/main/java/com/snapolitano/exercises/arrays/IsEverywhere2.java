package com.snapolitano.exercises.arrays;

public class IsEverywhere2 {

	public static boolean isEverywhere(int[] v, int value) {
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] != value && v[i + 1] != value) {
				return false;
			}
		}
		return true;
	}
}
