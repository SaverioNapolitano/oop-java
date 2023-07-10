package com.snapolitano.exercises.strings;

public class RemoveFirstTwoCharsIf {
	public static String removeFirstTwoCharsIf(String string) {
		StringBuilder stringBuilder = new StringBuilder(string);
		if (string.length() > 0 && string.charAt(0) != 'H')
			stringBuilder.deleteCharAt(0);
		if (string.length() > 1 && string.charAt(1) != 'e')
			stringBuilder.deleteCharAt(1);
		return stringBuilder.toString();
	}
}
