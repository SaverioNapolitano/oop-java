package com.snapolitano.exercises.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
	public static <T> void justPrintList(List<T> list) {
		list.forEach(item -> System.out.println("Hello " + item + "!"));
	}

	public static <K, V> void justPrintMap(Map<K, V> map) {
		map.forEach((k, v) -> System.out.println("k:" + k + ", v:" + v));
	}
}
