package com.snapolitano.exercises.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MorseCode2Test {

	@Test
	void morseCode() {
		assertEquals(".... . ._.. ._.. ___", MorseCode2.morseCode("hello"));
		assertEquals(".__ ___ ._. ._.. _..", MorseCode2.morseCode("world"));
		assertThrows(IllegalArgumentException.class, () -> MorseCode2.morseCode("w0rld"));
	}
}