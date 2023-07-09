package com.snapolitano.exercises.oop.basic;

import java.util.Arrays;

public class EnhancedResizableArray2 {
    static final int DEFAULT_CAPACITY = 4;
    int[] array;

    public EnhancedResizableArray2() {
        array = new int[DEFAULT_CAPACITY];
    }

    public boolean contains(int value){
        return Arrays.stream(array).anyMatch(value1 -> value1 == value);
    }

    public void fill(int value){
        Arrays.fill(array, value);
    }

    public int get(int index){
        return array[index];
    }

    public int length(){
        return array.length;
    }

    public void set(int index, int value){
        if(index >= array.length){
            array = Arrays.copyOf(array, array.length*2);
        }
        array[index] = value;
    }

    public int[] toArray(){
        return Arrays.copyOf(array, array.length);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        EnhancedResizableArray2 that = (EnhancedResizableArray2) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
