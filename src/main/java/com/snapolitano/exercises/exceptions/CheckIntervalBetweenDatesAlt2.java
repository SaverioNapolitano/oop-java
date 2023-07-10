package com.snapolitano.exercises.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt2 {
	public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {
		try {
			LocalDate firstDate = LocalDate.parse(begin);
			LocalDate secondDate = LocalDate.parse(end);

			return firstDate.isBefore(secondDate);
		} catch (DateTimeParseException e) {
			return false;
		}
	}
}
