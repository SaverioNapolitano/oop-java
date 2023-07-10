package com.snapolitano.exercises.collections;

import java.util.HashMap;
import java.util.Map;

public class InvertMap2 {
	public static Map<String, Integer> invertMap(Map<Integer, String> src) {
		Map<String, Integer> map = new HashMap<>();
		for (Map.Entry<Integer, String> entry : src.entrySet()) {
			map.put(entry.getValue(), entry.getKey());
		}
		return map;
	}
}
