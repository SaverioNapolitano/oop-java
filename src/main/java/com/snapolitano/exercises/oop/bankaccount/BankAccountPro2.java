package com.snapolitano.exercises.oop.bankaccount;

public class BankAccountPro2 extends AbstractBankAccount2 {

	public BankAccountPro2(double balance, String IBAN) {
		super(balance, IBAN, 0.02, -1);
	}

	@Override
	public double transfer(BankAccount2 other, double amount) {
		other.setBalance(other.getBalance() + amount);
		this.setBalance(this.getBalance() - amount);
		applyFee();
		return amount;
	}

	@Override
	public double withdraw(double amount) {
		this.setBalance(this.getBalance() - amount);
		applyFee();
		return amount;
	}
}
