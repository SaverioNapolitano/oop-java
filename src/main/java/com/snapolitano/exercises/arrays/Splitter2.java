package com.snapolitano.exercises.arrays;

public class Splitter2 {
	public static int[] splitter(int input) {
		String number = Integer.valueOf(input).toString();
		int[] array = new int[number.length()];
		for (int i = 0; i < number.length(); i++) {
			array[i] = Character.digit(number.charAt(i), 10);
		}
		return array;
	}
}
