package com.snapolitano.exercises.generics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairSameType2Test {

	@Test
	void swap() {
		PairSameType2<String> pairSameType2 = new PairSameType2<>("a", "b");
		pairSameType2.swap();
		assertEquals("b", pairSameType2.getFirst());
		assertEquals("a", pairSameType2.getSecond());
	}
}