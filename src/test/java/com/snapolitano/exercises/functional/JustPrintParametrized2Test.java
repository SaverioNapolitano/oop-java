package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class JustPrintParametrized2Test {

	@Test
	void justPrintList() {
		JustPrintParametrized2.justPrintList(List.of("Marco", "Matteo", "Luca", "Giovanni"), t -> System.out.println("Hello " + t + "!"));
	}

	@Test
	void justPrintMap() {
		JustPrintParametrized2.justPrintMap(Map.of(1, "nicola", 2, "agata", 3, "darma", 4, "marzia"),
				(k, v) -> System.out.println("k: " + k + ", v:" + v));
	}
}