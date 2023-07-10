package com.snapolitano.exercises.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static List<Integer> removeDuplicates(List<Integer> list) {
		Set<Integer> integerSet = new HashSet<>(list);
		return new ArrayList<>(integerSet);
	}
}
