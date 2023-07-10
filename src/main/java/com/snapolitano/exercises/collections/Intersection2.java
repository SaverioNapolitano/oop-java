package com.snapolitano.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Intersection2 {
	public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
		Set<Integer> set = new HashSet<>();
		for (Integer integer : first) {
			if (second.contains(integer)) {
				set.add(integer);
			}
		}
		return set;
	}
}
