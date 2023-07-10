package com.snapolitano.exercises.oop.bankaccount;

public abstract class AbstractBankAccount implements BankAccount {

	protected String IBAN;
	protected double balance;
	protected double interestRate;
	protected double operationFee;

	public AbstractBankAccount(String IBAN, double balance, double interestRate, double operationFee) {

		setIBAN(IBAN);
		setBalance(balance);
		setInterestRate(interestRate);
		setOperationFee(operationFee);
	}

	@Override
	public void addInterest() {
		balance += balance * interestRate;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
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
		this.IBAN = IBAN;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getOperationFee() {
		return operationFee;
	}

	@Override
	public void setOperationFee(double operationFee) {
		this.operationFee = operationFee;
	}
}
