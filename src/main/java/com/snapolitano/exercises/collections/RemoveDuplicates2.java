package com.snapolitano.exercises.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates2 {
    public static List<Integer> removeDuplicates(List<Integer> list){
        return new ArrayList<>(new HashSet<>(list));
    }
}
