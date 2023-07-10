package com.snapolitano.exercises.oop.basic;

import java.util.Arrays;

//TODO: remake (see javadoc)
public class EnhancedResizableArray {
	int[] v;

	public EnhancedResizableArray() {
		this.v = new int[0];
	}

	public void add(int value) {
		int[] w;
		w = Arrays.copyOf(v, v.length + 1);
		w[v.length] = value;
		v = Arrays.copyOf(w, w.length);
	}

	public void remove(int index) {
		for (int i = index; i < v.length - 1; i++) {
			v[i] = v[i + 1];
		}
		v = Arrays.copyOf(v, v.length - 1);
	}

	public int get(int index) {
		return v[index];
	}

	public void set(int index, int value) {
		v[index] = value;
	}

	public boolean contains(int value) {
		int index = Arrays.binarySearch(v, value);
		return index >= 0;
	}

	public int size() {
		return v.length;
	}

	public int[] toArray() {
		return Arrays.copyOf(v, v.length);
	}
}
