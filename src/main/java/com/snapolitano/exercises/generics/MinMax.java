package com.snapolitano.exercises.generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp){
        T maxValue = list.get(0);
        for (T value : list) {
            if (cmp.compare(maxValue, value) < 0) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp){
        T minValue = list.get(0);
        for (T value : list) {
            if (cmp.compare(minValue, value) > 0) {
                minValue = value;
            }
        }
        return minValue;
    }
}
