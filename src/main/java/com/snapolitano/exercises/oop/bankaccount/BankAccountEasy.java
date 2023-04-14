package com.snapolitano.exercises.oop.bankaccount;
//TODO: Constructor, exceptions
public class BankAccountEasy extends AbstractBankAccount{

    public BankAccountEasy(String IBAN, double balance) {
        //TODO: IBAN & balance check
        super(IBAN, balance, 0, 0);
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        if(other.getIBAN().substring(0,2).equals(this.getIBAN().substring(0,2)) && this.getBalance()-amount>0){
            other.setBalance(other.getBalance()+amount);
            this.setBalance(this.balance-amount);
            return amount;
        }
        double amountTransferred = this.getBalance();
        other.setBalance(other.getBalance()+amountTransferred);
        this.setBalance(0);
        return amountTransferred;
    }

    @Override
    public double withdraw(double amount) {
        if(this.getBalance()-amount>=0){
            this.setBalance(this.getBalance()-amount);
            return amount;
        }
        return this.getBalance();
    }
}
