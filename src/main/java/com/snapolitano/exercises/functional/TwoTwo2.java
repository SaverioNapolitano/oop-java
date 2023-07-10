package com.snapolitano.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo2 {
	public static List<Integer> twoTwo(List<Integer> nums) {
		return nums.stream().map(integer -> integer * 2).filter(integer -> !String.valueOf(integer).endsWith("2")).collect(Collectors.toList());
	}
}
