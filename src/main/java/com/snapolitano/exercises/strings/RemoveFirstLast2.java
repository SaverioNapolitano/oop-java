package com.snapolitano.exercises.strings;

public class RemoveFirstLast2 {
	public static String removeFirstLast(String string) {
		return string.length() > 1 && string.charAt(0) == string.charAt(string.length() - 1) ? string.substring(1,
				string.length() - 1) :
				string;
	}
}
