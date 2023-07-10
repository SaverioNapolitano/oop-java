package com.snapolitano.exercises.strings;

public class Concatenate {
	public static String concatenate(String[] strings) {
		StringBuilder concatString = new StringBuilder();
		for (String string : strings) {
			concatString.append(string);
		}
		return concatString.toString();
	}
}
