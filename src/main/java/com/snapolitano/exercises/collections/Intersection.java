package com.snapolitano.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
	public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
		Set<Integer> integerSet = new HashSet<>();
		for (Integer integer : first) {
			if (second.contains(integer)) {
				integerSet.add(integer);
			}
		}
		return integerSet;
	}
}
