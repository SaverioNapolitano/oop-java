package com.snapolitano.exercises.oop.basic;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class EnhancedArray {
    int[] array;

    public EnhancedArray(int capacity) {
        this.array = new int[capacity];
    }

    public int size() {
        return array.length;
    }

    public int get(int index) {
        return array[index];
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public boolean contains(int value) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, value);
        return index >= 0;
    }

    public void resetZero() {
        Arrays.fill(array, 0);
    }

    public void resetRandom() {
        RandomGenerator rnd = RandomGenerator.getDefault();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(0, array.length + 1);
        }
    }

    public int[] toArray() {
        return Arrays.copyOf(array, array.length);
    }
}
