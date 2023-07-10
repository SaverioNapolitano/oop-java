package com.snapolitano.exercises.generics;

import java.util.List;

public class AppendBounded2 {

	public static <T> void append(List<T> dst, List<? extends T> src) {
		dst.addAll(src);
	}
}
