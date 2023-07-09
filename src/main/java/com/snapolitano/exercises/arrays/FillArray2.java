package com.snapolitano.exercises.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray2 {

    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] array = new double[size];
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        if(addNoise){
            Arrays.fill(array, value + randomGenerator.nextDouble(-0.05 * value, 0.05 * value));
        } else {
            Arrays.fill(array, value);
        }
        return array;
    }
}
