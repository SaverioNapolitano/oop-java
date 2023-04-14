package com.snapolitano.exercises.arrays;

public class CanBalance {
    public static boolean canBalance(int[] v) {
        int j = v.length - 1;
        int i = 0;
        int leftSum = v[i];
        int rightSum = v[j];
        int sum = 0;
        for (int value : v) {
            sum += value;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int leftSumFinal = sum / 2;
        int rightSumFinal = sum / 2;
        while (j - i > 1) {
            if (Math.abs(leftSum) < Math.abs(leftSumFinal) || leftSum < leftSumFinal) {
                leftSum += v[++i];
            }
            if (Math.abs(rightSum) < Math.abs(rightSumFinal) || rightSum < rightSumFinal) {
                rightSum += v[--j];
            }
        }
        return leftSum == rightSum;
    }
}
