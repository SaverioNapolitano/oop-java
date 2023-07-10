package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DivisionTest {

	@Test
	void division() {
		assertThrows(IllegalArgumentException.class, () -> Division.division(-1, 0));
		assertThrows(IllegalArgumentException.class, () -> Division.division(1, 0));
		assertEquals(2.0, Division.division(4.0, 2.0), 0.001);
		assertEquals(-2.0, Division.division(-8.0, 4.0), 0.001);
	}
}