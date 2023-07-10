package com.snapolitano.exercises.arrays;

public class MatchUp {
	public static int matchUp(int[] v1, int[] v2) {
		int count = 0;
		for (int i = 0; i < v1.length; i++) {
			if (Math.abs(v1[i] - v2[i]) <= 2 && Math.abs(v1[i] - v2[i]) > 0) {
				count++;
			}
		}
		return count;
	}
}
