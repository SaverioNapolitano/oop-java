package com.snapolitano.exercises.collections;

import java.util.List;

public class DownSize2 {
	public static void downsize(List<String> list, int n) {
		List<String> strings = list.stream().filter(s -> (list.indexOf(s) + 1) % n > 0).toList();
		list.clear();
		list.addAll(strings);
	}
}
