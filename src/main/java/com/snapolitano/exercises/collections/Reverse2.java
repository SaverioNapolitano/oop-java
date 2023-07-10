package com.snapolitano.exercises.collections;

import java.util.ArrayDeque;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse2 {
	public static List<String> reverse(List<String> sentence) {
		ArrayDeque<String> strings = new ArrayDeque<>(sentence.size());
		strings.addAll(sentence);
		return sentence.stream().map(s -> strings.pollLast()).collect(Collectors.toList());
	}
}
