package com.snapolitano.exercises.warmup;

import java.util.Scanner;

public class MonkeyTrouble {

    public static boolean areWeInTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile)
            return true;
        return !aSmile && !bSmile;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Is the a monkey smiling?");
        boolean aSmile = scanner.nextBoolean();
        System.out.println("Is the b monkey smiling?");
        boolean bSmile = scanner1.nextBoolean();
        if (areWeInTrouble(aSmile, bSmile))
            System.out.println("Watch out, we are in trouble");
    }
}
