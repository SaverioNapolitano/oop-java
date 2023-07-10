package com.snapolitano.exercises.strings;

public class GoodAroundTheBeginning2 {
	public static boolean goodAroundTheBeginning(String string) {
		return string.startsWith("good") || string.startsWith("good", 1);
	}
}
