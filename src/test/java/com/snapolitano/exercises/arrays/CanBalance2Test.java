package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CanBalance2Test {

	@Test
	void canBalance() {
		assertTrue(CanBalance2.canBalance(new int[]{1, 1, 1, 2, 1}));
		assertFalse(CanBalance2.canBalance(new int[]{2, 1, 1, 2, 1}));
		assertTrue(CanBalance2.canBalance(new int[]{10, 10}));
		assertTrue(CanBalance.canBalance(new int[]{1, -5, 1, -2, -1}));
		assertTrue(CanBalance.canBalance(new int[]{-1, -2, -3, -6}));
	}
}