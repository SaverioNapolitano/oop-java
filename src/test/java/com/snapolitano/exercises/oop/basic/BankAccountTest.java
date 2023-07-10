package com.snapolitano.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankAccountTest {

	BankAccount account = new BankAccount();

	@Test
	void getBalance() {
		assertEquals(0, account.getBalance());
	}

	@Test
	void deposit() {
		account.deposit(100);
		assertEquals(100, account.getBalance());
	}

	@Test
	void withdraw() {
		account.deposit(100);
		account.withdraw(50);
		assertEquals(50, account.getBalance());
	}
}