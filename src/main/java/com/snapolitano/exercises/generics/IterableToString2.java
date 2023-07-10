package com.snapolitano.exercises.generics;

public class IterableToString2 {

	public static <E> String iterableToString(Iterable<E> src) {
		StringBuilder s = new StringBuilder(src.toString());
		return s.deleteCharAt(0).deleteCharAt(s.length() - 1).append(", ").toString();
	}
}
