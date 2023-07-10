package com.snapolitano.exercises.strings;

public class RemoveFirstTwoChars2 {

	public static String removeFirstTwoChars(String string) {
		return new StringBuilder(string).delete(0, 2).toString();
	}
}
