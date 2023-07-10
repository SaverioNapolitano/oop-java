package com.snapolitano.exercises.arrays;

public class TenRun {
	public static int[] tenRun(int[] v) {
		int tenMultiple = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 10 == 0) {
				tenMultiple = v[i];
			}
			if (v[i] % 10 != 0 && tenMultiple != 0) {
				v[i] = tenMultiple;
			}
		}
		return v;
	}
}
