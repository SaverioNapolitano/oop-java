package com.snapolitano.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatchUp2Test {

	@Test
	void matchUp() {
		assertEquals(2, MatchUp2.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
		assertEquals(3, MatchUp2.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 5}));
		assertEquals(2, MatchUp2.matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 3}));
	}
}