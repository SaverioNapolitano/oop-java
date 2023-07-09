package com.snapolitano.exercises.generics;

public class Divide2 {
    public static <T extends Number> double divide(T a, T b){
        return a.doubleValue()/ b.doubleValue();
    }
}
