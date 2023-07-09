package com.snapolitano.exercises.arrays;

public class TenRun2 {

    public static int[] tenRun(int[] v){
        int ten = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i] % 10 == 0){
                ten = v[i];
            } else if (ten > 0) {
                v[i] = ten;
            }
        }
        return v;
    }
}
