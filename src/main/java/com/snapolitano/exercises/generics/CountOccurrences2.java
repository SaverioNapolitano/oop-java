package com.snapolitano.exercises.generics;

import java.util.Arrays;
import java.util.Objects;

public class CountOccurrences2 {
	public static <T> int countOccurrences(T[] src, T item) {
		return item == null ? Integer.parseInt(String.valueOf(Arrays.stream(src).filter(Objects::isNull).count())) :
				Integer.parseInt(String.valueOf(Arrays.stream(src).filter(Objects::nonNull).filter(i -> i.equals(item)).count()));
	}
}
