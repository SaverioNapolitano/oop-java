package com.snapolitano.exercises.strings;

public class Concatenate2 {
	public static String concatenate(String[] strings) {
		StringBuilder stringBuilder = new StringBuilder();
		for (String string : strings) {
			stringBuilder.append(string);
		}
		return stringBuilder.toString();
	}
}
