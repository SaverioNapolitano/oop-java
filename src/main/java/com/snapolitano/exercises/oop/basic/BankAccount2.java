package com.snapolitano.exercises.oop.basic;

public class BankAccount2 {
    double balance;

    public BankAccount2() {
        this.balance = 0;
    }

    public BankAccount2(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }
}
