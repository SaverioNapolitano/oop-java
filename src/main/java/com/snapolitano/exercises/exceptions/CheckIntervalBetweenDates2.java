package com.snapolitano.exercises.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDates2 {
	public static boolean checkIntervalBetweenDates(String begin, String end) throws DateTimeParseException {
		LocalDate firstDate = LocalDate.parse(begin);
		LocalDate secondDate = LocalDate.parse(end);

		return firstDate.isBefore(secondDate);
	}
}
