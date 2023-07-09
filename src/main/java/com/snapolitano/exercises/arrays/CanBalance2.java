package com.snapolitano.exercises.arrays;

public class CanBalance2 {

    private static int sum(int[] v, int from, int to){
        int sum = 0;
        for(int i = from; i < to; i++){
            sum += v[i];
        }
        return sum;
    }
    public static boolean canBalance(int[] v){
        for(int i = 0; i < v.length; i++){
            if(sum(v, 0, i) == sum(v, i, v.length)){
                return true;
            }
        }
        return false;
    }
}
