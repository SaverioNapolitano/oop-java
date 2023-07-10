package com.snapolitano.exercises.strings;

public class SumDigits2 {
	public static int sumDigits(String string) {
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				sum += Character.getNumericValue(string.charAt(i));
			}
		}
		return sum;
	}
}
