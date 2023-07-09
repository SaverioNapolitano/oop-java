package com.snapolitano.exercises.arrays;

import java.util.Arrays;

public class DeepCopy2 {

    public static int[][] deepCopy(int[][] original){
        int[][] copy;
        copy = Arrays.copyOf(original, original.length);
        for(int i = 0; i < original.length; i++){
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return copy;
    }
}
