package com.snapolitano.exercises.generics;

public class Measure {
    public interface Measurer<T> {
        double measure(T obj);
    }

    public static <T> T max(T[] array, Measurer<T> measurer) {
        T maxValue = array[0];
        for (T value : array) {
            if (measurer.measure(maxValue) < measurer.measure(value)) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static <T> T min(T[] array, Measurer<T> measurer) {
        T minValue = array[0];
        for (T value : array) {
            if (measurer.measure(minValue) > measurer.measure(value)) {
                minValue = value;
            }
        }
        return minValue;
    }
}
