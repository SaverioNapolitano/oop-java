package com.snapolitano.exercises.arrays;

public class FizzBuzz {

	static final int MULTIPLE_OF_3 = 3;
	static final int MULTIPLE_OF_5 = 5;
	static final int MULTIPLE_OF_3_AND_5 = 1;
	static final int NO_MULTIPLE = 0;

	public static String[] fizzBuzz(int start, int end) {
		Integer[] integers = new Integer[end - start];
		String[] strings = new String[end - start];
		int val = start;
		for (int i = 0; i < integers.length; i++) {
			integers[i] = val++;
			switch (isMultiple(integers[i])) {
				case MULTIPLE_OF_3 -> strings[i] = "Fizz";
				case MULTIPLE_OF_5 -> strings[i] = "Buzz";
				case MULTIPLE_OF_3_AND_5 -> strings[i] = "FizzBuzz";
				case NO_MULTIPLE -> strings[i] = Integer.toString(integers[i]);
			}
		}
		return strings;
	}

	private static int isMultiple(int val) {
		if (val % 3 == 0 && val % 5 == 0) {
			return MULTIPLE_OF_3_AND_5;
		}
		if (val % 3 == 0) {
			return MULTIPLE_OF_3;
		}
		if (val % 5 == 0) {
			return MULTIPLE_OF_5;
		}
		return NO_MULTIPLE;
	}
}
