package com.snapolitano.exercises.strings;

import java.util.Arrays;

public class DuplicateChars {

	public static char[] duplicateChars(String string) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			if (string.indexOf(string.charAt(i)) != string.lastIndexOf(string.charAt(i))) {
				if (!builder.toString().contains(String.valueOf(string.charAt(i)))) {
					builder.append(string.charAt(i));
				}
			}
		}
		char[] output = builder.toString().toCharArray();
		Arrays.sort(output);
		return output;
	}
}
