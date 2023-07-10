package com.snapolitano.exercises.arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {
	public static double[] fillArray(int size, int value, boolean randomize) {
		double[] filledArray = new double[size];
		Arrays.fill(filledArray, value);
		RandomGenerator rnd = RandomGenerator.getDefault();
		for (int i = 0; i < size; i++) {
			if (randomize) {
				filledArray[i] += rnd.nextDouble(-0.5, 0.50);
			}
		}
		return filledArray;
	}
}
