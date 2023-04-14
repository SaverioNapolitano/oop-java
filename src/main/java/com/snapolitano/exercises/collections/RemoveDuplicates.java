package com.snapolitano.exercises.collections;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> integerSet = new HashSet<>(list);
        return new ArrayList<>(integerSet);
    }
}
