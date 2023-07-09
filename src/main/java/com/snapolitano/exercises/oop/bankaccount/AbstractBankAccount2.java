package com.snapolitano.exercises.oop.bankaccount;

public abstract class AbstractBankAccount2 implements BankAccount2{

    protected double balance;
    protected String IBAN;
    protected double interestRate;
    protected double operationFee;

    public AbstractBankAccount2(double balance, String IBAN, double interestRate, double operationFee) {
        this.setBalance(balance);
        this.setIBAN(IBAN);
        this.setInterestRate(interestRate);
        this.setOperationFee(operationFee);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        if(interestRate < 0){
            throw new IllegalArgumentException("Interest rate has to be positive");
        }
        this.interestRate = interestRate;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setOperationFee(double operationFee) {
        if(operationFee > 0){
            throw new IllegalArgumentException("Operation fee has to be negative");
        }
        this.operationFee = operationFee;
    }

    protected void applyFee(){
        this.setBalance(this.getBalance() + this.getOperationFee());
    }

    protected void checkIBAN(String IBAN){
        if(IBAN.length() < 27 || IBAN.length() > 34 || !Character.isLetter(IBAN.charAt(0)) || !Character.isLetter(IBAN.charAt(1))){
            throw new IllegalArgumentException("Invalid IBAN");
        }
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Amount to deposit has to be positive");
        }
        this.setBalance(this.getBalance() + amount);
        applyFee();
    }

    public void addInterest(){
        this.setBalance(this.getBalance() + this.getBalance() * this.getInterestRate());
    }

    public abstract double transfer(BankAccount2 other, double amount);

    public abstract double withdraw(double amount);
}
