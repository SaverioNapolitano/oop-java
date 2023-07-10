package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GoodAroundTheBeginningTest {

	@Test
	void goodAroundTheBeginning() {
		assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good Sweet"));
		assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning(" good Sweet"));
		assertFalse(GoodAroundTheBeginning.goodAroundTheBeginning("  good Sweet"));
		assertFalse(GoodAroundTheBeginning.goodAroundTheBeginning("goo"));
	}
}