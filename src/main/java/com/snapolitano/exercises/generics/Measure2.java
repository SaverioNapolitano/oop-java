package com.snapolitano.exercises.generics;

import java.util.Arrays;

public class Measure2 {
    public interface Measurer<T> {
        double measure(T obj);
    }

    public static <T> T max(T[] array, Measurer<T> measurer){
        Arrays.sort(array, (a, b) -> Double.valueOf(measurer.measure(a) - measurer.measure(b)).intValue());
        return array[array.length-1];
    }
    public static <T> T min(T[] array, Measurer<T> measurer){
        Arrays.sort(array, (a, b) -> Double.valueOf(measurer.measure(a) - measurer.measure(b)).intValue());
        return array[0];
    }


}
