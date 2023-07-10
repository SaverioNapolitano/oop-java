package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class JustPrint2Test {

	@Test
	void justPrintList() {
		JustPrint2.justPrintList(List.of("Marco", "Matteo", "Luca", "Giovanni"));
	}

	@Test
	void justPrintMap() {
		JustPrint2.justPrintMap(Map.of(1, "nicola", 2, "agata", 3, "darma", 4, "marzia"));
	}
}