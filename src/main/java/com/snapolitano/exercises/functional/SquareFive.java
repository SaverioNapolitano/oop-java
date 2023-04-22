package com.snapolitano.exercises.functional;

import java.util.List;

public class SquareFive {
    public static long squareFive(List<Integer> nums) {
        return nums.stream().map(i -> i * i + 10).filter(i -> !String.valueOf(i).endsWith("5")).count();
    }
}
