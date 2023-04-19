package com.snapolitano.exercises.oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount {

    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 0.02, 1);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        this.setBalance(this.getBalance()-1);
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        other.setBalance(other.getBalance() + amount);
        this.setBalance(this.getBalance() - amount - this.getOperationFee());
        return amount;
    }

    @Override
    public double withdraw(double amount) {
        this.setBalance(this.getBalance() - amount - this.getOperationFee());
        return amount;
    }
}
