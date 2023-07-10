package com.snapolitano.exercises.arrays;

public class MoveZeroEnd2 {
	public static int[] moveZerosEnd(int[] v) {
		int last_zero = v.length;
		for (int i = 0; i < v.length; i++) {
			boolean moved = false;
			if (v[i] == 0) {
				int zero = v[i];
				for (int j = i + 1; j < v.length; j++) {
					v[j - 1] = v[j];
					moved = true;
				}
				if (moved && i < last_zero) {
					i--;
					v[--last_zero] = zero;
				}
			}
		}
		return v;
	}
}
