package com.snapolitano.exercises.collections;

import java.util.*;

public class WordFrequencySorted {

	public static Map<String, Integer> mostFrequent(Map<String, Integer> map, int limit) {
		Map<String, Integer> linkedMap = new LinkedHashMap<>();
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		entryList.sort((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()));
		for (int i = 0; i < limit; i++) {
			linkedMap.put(entryList.get(i).getKey(), entryList.get(i).getValue());
		}
		return linkedMap;
	}

	public static Map<String, Integer> lessFrequent(Map<String, Integer> map, int limit) {
		Map<String, Integer> linkedMap = new LinkedHashMap<>();
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		entryList.sort(Comparator.comparingInt(Map.Entry::getValue));
		for (int i = 0; i < limit; i++) {
			linkedMap.put(entryList.get(i).getKey(), entryList.get(i).getValue());
		}
		return linkedMap;
	}
}
