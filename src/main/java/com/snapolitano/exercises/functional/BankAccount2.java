package com.snapolitano.exercises.functional;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BankAccount2 {
	public static List<Account> applyInterest(List<Account> accounts) {
		return accounts.stream().filter(account -> account.getDuePayment().isBefore(LocalDateTime.now())).peek(account -> account.setAmount(account.getAmount() + account.getAmount() * account.getInterestRate())).sorted(Comparator.comparingDouble(Account::getAmount)).collect(Collectors.toList());
	}

	public static class Account {
		double amount;
		double interestRate;
		LocalDateTime duePayment;

		public Account(double amount, double interestRate, LocalDateTime duePayment) {
			this.amount = amount;
			this.interestRate = interestRate;
			this.duePayment = duePayment;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		@Override
		public int hashCode() {
			return Objects.hash(amount, interestRate, duePayment);
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Account account = (Account) o;
			return Double.compare(account.amount, amount) == 0 && Double.compare(account.interestRate, interestRate) == 0 && Objects.equals(duePayment, account.duePayment);
		}

		@Override
		public String toString() {
			return "Account{" + "amount=" + amount + ", interestRate=" + interestRate + ", duePayment=" + duePayment + '}';
		}

		public double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}

		public LocalDateTime getDuePayment() {
			return duePayment;
		}

		public void setDuePayment(LocalDateTime duePayment) {
			this.duePayment = duePayment;
		}
	}
}
