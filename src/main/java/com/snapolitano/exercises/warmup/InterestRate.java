package com.snapolitano.exercises.warmup;

public class InterestRate {

    static final double INITIAL_BALANCE = 1000;
    static final double INTEREST_PER_YEAR = 0.05;

    public static double balanceAfterOneYear(double balance) {
        return balance + INTEREST_PER_YEAR * balance;
    }

    public static void main(String[] args) {
        double balance = balanceAfterOneYear(INITIAL_BALANCE);
        System.out.println("First year: " + balance);
        balance = balanceAfterOneYear(balance);
        System.out.println("Second year: " + balance);
        balance = balanceAfterOneYear(balance);
        System.out.println("Third year: " + balance);
    }
}
