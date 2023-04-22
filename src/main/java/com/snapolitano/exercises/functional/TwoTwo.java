package com.snapolitano.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {
    public static List<Integer> twoTwo(List<Integer> nums) {
        return nums.stream().map(integer -> integer * 2).filter(i -> !Integer.toString(i).endsWith("2")).collect(Collectors.toList());
    }
}
