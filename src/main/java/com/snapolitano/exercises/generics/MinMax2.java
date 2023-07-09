package com.snapolitano.exercises.generics;

import java.util.Comparator;
import java.util.List;

public class MinMax2 {
    public static <T> T max(List<T> list, Comparator<? super T> cmp){
        list.sort(cmp);
        return list.get(list.size()-1);
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp){
        list.sort(cmp);
        return list.get(0);
    }
}
