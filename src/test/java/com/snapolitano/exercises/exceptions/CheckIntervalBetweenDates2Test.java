package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIntervalBetweenDates2Test {

	@Test
	void checkIntervalBetweenDates() {
		assertTrue(CheckIntervalBetweenDates2.checkIntervalBetweenDates("2022-12-23", "2023-12-24"));
		assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("15-12-2022", "17/12/2022"));
		assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("15/12-2022", "17/12-2022"));
		assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("15-32-2022", "17/12-20oo"));
	}
}