package com.snapolitano.exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(integer -> integer < 13 || integer > 19).collect(Collectors.toList());
    }
}
