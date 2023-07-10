package com.snapolitano.exercises.generics;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToPairs2 {
	public static <K, V> List<Pair2<K, V>> mapToPairs(Map<K, V> src) {
		return src.entrySet().stream().map(kvEntry -> new Pair2<>(kvEntry.getKey(), kvEntry.getValue())).collect(Collectors.toList());
	}
}
