package com.snapolitano.exercises.exceptions;

import java.text.ParseException;

public class CheckString2 {
	public static void checkString(String s) throws ParseException {
		if (s.length() < 2) {
			throw new ParseException(s, 0);
		}
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0 && !Character.isLetter(s.charAt(i))) {
				throw new ParseException(s, i);
			}
			if (i % 2 != 0 && !Character.isDigit(s.charAt(i))) {
				throw new ParseException(s, i);
			}
		}
	}
}
