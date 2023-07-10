package com.snapolitano.exercises.functional;

import java.util.Map;

public class PayMore {
	public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta) {
		fees.replaceAll((k, v) -> k.startsWith(numberFamily) ? v + costDelta : v);
	}
}
