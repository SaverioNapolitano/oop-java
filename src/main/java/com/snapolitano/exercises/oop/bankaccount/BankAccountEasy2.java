package com.snapolitano.exercises.oop.bankaccount;

public class BankAccountEasy2 extends AbstractBankAccount2 {
	public BankAccountEasy2(double balance, String IBAN) {
		super(balance, IBAN, 0, 0);
	}

	@Override
	public double transfer(BankAccount2 other, double amount) {
		if (!other.getIBAN().substring(0, 2).equals(this.getIBAN().substring(0, 2))) {
			throw new IllegalArgumentException("International transfers are not allowed");
		}
		if (amount <= this.getBalance()) {
			other.setBalance(other.getBalance() + amount);
			this.setBalance(this.getBalance() - amount);
		} else {
			amount = this.getBalance();
			other.setBalance(other.getBalance() + amount);
			this.setBalance(0);
		}
		return amount;
	}

	@Override
	public void setBalance(double balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Balance has to be positive");
		}
		this.balance = balance;
	}

	@Override
	public double withdraw(double amount) {
		if (amount <= this.getBalance()) {
			this.setBalance(this.getBalance() - amount);
		} else {
			amount = this.getBalance();
			this.setBalance(0);
		}
		return amount;
	}
}
