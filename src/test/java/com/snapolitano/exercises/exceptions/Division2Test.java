package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Division2Test {

	@Test
	void division() {
		assertThrows(IllegalArgumentException.class, () -> Division2.division(2, 0));
		assertEquals(1.0, Division2.division(3, 3));
	}
}