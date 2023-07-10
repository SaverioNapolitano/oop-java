package com.snapolitano.exercises.arrays;

public class BubbleSort2 {

	public static void bubbleSort(int[] v) {
		boolean changed = true;
		while (changed) {
			changed = false;
			for (int i = 0; i < v.length - 1; i++) {
				if (v[i] > v[i + 1]) {
					int tmp = v[i];
					v[i] = v[i + 1];
					v[i + 1] = tmp;
					changed = true;
				}
			}
		}
	}

	public static int[] bubbleSortCopy(int[] v) {
		int[] sorted = new int[v.length];
		boolean changed = true;
		int j = 1;
		while (changed) {
			changed = false;
			for (int i = 0; i < v.length - 1; i++) {
				if (v[i] > v[i + 1]) {
					int tmp = v[i];
					v[i] = v[i + 1];
					v[i + 1] = tmp;
					changed = true;
				}
			}
			sorted[sorted.length - j] = v[v.length - j];
			++j;
		}
		return sorted;
	}
}
