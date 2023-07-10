package com.snapolitano.exercises.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Eratosthenes {
	public static Set<Integer> eratosthenes(int n) {
		Set<Integer> integerSet = new HashSet<>();
		for (int i = 2; i <= n; i++) {
			integerSet.add(i);
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			for (Iterator<Integer> iterator = integerSet.iterator(); iterator.hasNext(); ) {
				Integer integer = iterator.next();
				if (integer % i == 0 && integer != i) {
					iterator.remove();
				}
			}
		}
		return integerSet;
	}
}
