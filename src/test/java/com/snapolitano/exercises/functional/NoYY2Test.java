package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoYY2Test {

	@Test
	void noYY() {
		assertEquals(List.of("ay", "by", "cy"), NoYY2.noYY(new ArrayList<>(List.of("a", "b", "c"))));
		assertEquals(List.of("ay", "by"), NoYY2.noYY(new ArrayList<>(List.of("a", "b", "cy"))));
		assertEquals(List.of("xxy", "yay", "zzy"), NoYY2.noYY(new ArrayList<>(List.of("xx", "ya", "zz"))));
	}
}