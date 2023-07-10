package com.snapolitano.exercises.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt {
	public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {
		LocalDate firstDate;
		LocalDate secondtDate;
		try {
			firstDate = LocalDate.parse(begin);
			secondtDate = LocalDate.parse(end);
		} catch (DateTimeParseException e) {
			return false;
		}
		return firstDate.isBefore(secondtDate);
	}
}
