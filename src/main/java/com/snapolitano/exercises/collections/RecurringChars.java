package com.snapolitano.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
	public static Set<Character> recurringChars(String string) {
		Set<Character> characterSet = new HashSet<>();
		Set<Character> characters = new HashSet<>();
		for (int i = 0; i < string.length(); i++) {
			if (!characters.contains(string.charAt(i))) {
				characters.add(string.charAt(i));
			} else {
				characterSet.add(string.charAt(i));
			}
		}
		return characterSet;
	}
}
