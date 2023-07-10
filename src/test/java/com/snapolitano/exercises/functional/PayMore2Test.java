package com.snapolitano.exercises.functional;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class PayMore2Test {

	@Test
	void payMore() {
		Map<String, Double> fees = new HashMap<>(Map.of("34745...", 11.75,
				"33367...", 9.75,
				"34833...", 7.75,
				"33188...", 7.75,
				"33112...", 7.95));
		PayMore2.payMore(fees, "333", 0.5);
		System.out.println(fees);
		fees = new HashMap<>(Map.of("34745...", 11.75,
				"33367...", 9.75,
				"34833...", 7.75,
				"33188...", 7.75,
				"33112...", 7.95));
		PayMore2.payMore(fees, "347", -1);
		System.out.println(fees);
	}
}