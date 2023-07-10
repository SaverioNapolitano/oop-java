package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EqualIsNot2Test {

	@Test
	void equalIsNot() {
		assertFalse(EqualIsNot2.equalIsNot("This is not"));
		assertTrue(EqualIsNot2.equalIsNot("This is notnot"));
		assertTrue(EqualIsNot2.equalIsNot("noisxxnotyynotxisi"));
	}
}