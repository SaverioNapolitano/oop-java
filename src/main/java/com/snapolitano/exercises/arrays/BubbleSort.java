package com.snapolitano.exercises.arrays;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] v) {
        int tmp;
        int max;
        for (int i = 0; i < v.length; i++) {
            max = v[i];
            for (int j = i + 1; j < v.length; ++j) {
                if (v[j] < max) {
                    tmp = v[j];
                    v[j] = max;
                    v[j - 1] = tmp;
                    i = -1;
                } else {
                    max = v[j];
                }
            }
        }
    }

    public static int[] bubbleSortCopy(int[] v) {
        int[] copy = Arrays.copyOf(v, v.length);
        bubbleSort(copy);
        return copy;
    }
}
