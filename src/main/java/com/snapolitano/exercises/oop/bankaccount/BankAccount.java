package com.snapolitano.exercises.oop.bankaccount;

public interface BankAccount {

	void addInterest();

	void deposit(double amount);

	double getBalance();

	void setBalance(double balance);

	String getIBAN();

	void setIBAN(String IBAN);

	double getInterestRate();

	void setInterestRate(double interestRate);

	double getOperationFee();

	void setOperationFee(double operationFee);

	double transfer(BankAccount other, double amount);

	double withdraw(double amount);
}
