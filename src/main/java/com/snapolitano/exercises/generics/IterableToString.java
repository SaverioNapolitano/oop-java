package com.snapolitano.exercises.generics;

public class IterableToString {
	public static <E> String iterableToString(Iterable<E> src) {
		StringBuilder stringBuilder = new StringBuilder(src.toString());
		return stringBuilder.deleteCharAt(0).deleteCharAt(stringBuilder.length() - 1).append(", ").toString();
	}
}
