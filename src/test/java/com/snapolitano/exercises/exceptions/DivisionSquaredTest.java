package com.snapolitano.exercises.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionSquaredTest {

	@Test
	void divisionSquared() {
		assertEquals(4, DivisionSquared.divisionSquared(4, 2));
		assertEquals(4, DivisionSquared.divisionSquared(-8, 4));
		assertEquals(0, DivisionSquared.divisionSquared(4, 0));
		assertEquals(0, DivisionSquared.divisionSquared(-8, 0));
	}
}