package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntervalBetweenDatesTest {

	@Test
	void checkIntervalBetweenDates() {
		assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("15-12-2022", "17/12/2022"));
		assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("15/12-2022", "17/12-2022"));
		assertThrows(DateTimeParseException.class, () -> CheckIntervalBetweenDates.checkIntervalBetweenDates("15-32-2022", "17/12-20oo"));
		try {
			assertTrue(CheckIntervalBetweenDates.checkIntervalBetweenDates("2022-12-15", "2022-12-17"));
			assertFalse(CheckIntervalBetweenDates.checkIntervalBetweenDates("2022-12-15", "2021-12-15"));
		} catch (DateTimeParseException ignored) {
		}
	}
}