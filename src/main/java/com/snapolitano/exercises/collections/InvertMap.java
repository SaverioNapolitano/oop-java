package com.snapolitano.exercises.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InvertMap {
	public static Map<String, Integer> invertMap(Map<Integer, String> src) {
		Set<Map.Entry<Integer, String>> entrySet = src.entrySet();
		Map<String, Integer> map = new HashMap<>();
		for (Map.Entry<Integer, String> entry : entrySet) {
			map.put(entry.getValue(), entry.getKey());
		}
		return map;
	}
}
