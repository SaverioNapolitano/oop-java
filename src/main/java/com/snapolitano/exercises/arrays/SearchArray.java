package com.snapolitano.exercises.arrays;

import java.util.Arrays;

public class SearchArray {
	public static boolean containsBruteForce(String[] strings, String searched) {
		for (String string : strings) {
			if (string.compareTo(searched) == 0) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsBinary(String[] strings, String searched) {
		String[] str = Arrays.copyOf(strings, strings.length);
		Arrays.sort(str);
		return Arrays.binarySearch(str, searched) >= 0;
	}
}
