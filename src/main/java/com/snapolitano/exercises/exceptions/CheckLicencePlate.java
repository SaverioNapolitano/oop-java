package com.snapolitano.exercises.exceptions;

public class CheckLicencePlate {
	public static void checkLicencePlate(String licence) {
		boolean valid =
				licence.length() == 7 && Character.isLetter(licence.charAt(0)) && Character.isLetter(licence.charAt(1)) && Character.isDigit(licence.charAt(2)) && Character.isDigit(licence.charAt(3)) && Character.isDigit(licence.charAt(4)) && Character.isLetter(licence.charAt(5)) && Character.isLetter(licence.charAt(6));
		if (!valid) {
			throw new IllegalArgumentException();
		}
	}
}
