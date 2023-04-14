package com.snapolitano.exercises.arrays;

import java.util.Arrays;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor) {
        double[] dividedArray = Arrays.copyOf(v, v.length);
        for (int i = 0; i < v.length; i++) {
            dividedArray[i] /= factor;
        }
        return dividedArray;
    }
}
