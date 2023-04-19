package com.snapolitano.exercises.oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount {

    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0, 0);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void setBalance(double balance) {
        if (balance >= 0) {
            super.setBalance(balance);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        if (!other.getIBAN().substring(0, 2).equals(this.getIBAN().substring(0, 2))) {
            throw new IllegalArgumentException();
        }
        if (this.getBalance() - amount >= 0) {
            other.setBalance(other.getBalance() + amount);
            this.setBalance(this.balance - amount);
            return amount;
        }
        double amountTransferred = this.getBalance();
        other.setBalance(other.getBalance() + amountTransferred);
        this.setBalance(0);
        return amountTransferred;
    }

    @Override
    public double withdraw(double amount) {
        if (this.getBalance() - amount >= 0) {
            this.setBalance(this.getBalance() - amount);
            return amount;
        }
        double balance = this.getBalance();
        this.setBalance(0);
        return balance;
    }
}
