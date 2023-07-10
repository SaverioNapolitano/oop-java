package com.snapolitano.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumDigits2Test {

	@Test
	void sumDigits() {
		assertEquals(6, SumDigits2.sumDigits("aa1bc2d3"));
		assertEquals(8, SumDigits2.sumDigits("aa11b33"));
		assertEquals(0, SumDigits2.sumDigits("Chocolate"));
	}
}