package com.snapolitano.exercises.arrays;

public class Splitter {
	public static int[] splitter(int input) {
		char[] chars = Integer.toString(input).toCharArray();
		int[] output = new int[chars.length];
		for (int i = 0; i < chars.length; i++) {
			output[i] = Character.digit(chars[i], 10);
		}
		return output;
	}
}
