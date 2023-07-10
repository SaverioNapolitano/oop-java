package com.snapolitano.exercises.functional;

import java.util.List;

public class SquareFive2 {
	public static long squareFive(List<Integer> nums) {
		return nums.stream().map(integer -> integer * integer + 10).filter(integer -> !String.valueOf(integer).endsWith(
				"5")).count();
	}
}
