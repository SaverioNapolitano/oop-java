package com.snapolitano.exercises.exceptions;

public class DivisionSquared2 {

    public static int divisionSquared(int a, int b){
        int r;
        try{
            r = (a/b)*(a/b);
        } catch (ArithmeticException e){
            r = 0;
        }
        return r;
    }
}
