package com.snapolitano.exercises.collections;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortAccount {
	public static void sortByAmount(List<Account> accounts) {
		accounts.sort((o1, o2) -> {
			Double d1 = o1.getAmount();
			Double d2 = o2.getAmount();
			return d1.compareTo(d2);
		});
	}

	public static void sortByInterestRate(List<Account> accounts) {
		accounts.sort((o1, o2) -> {
			Double d1 = o1.getInterestRate();
			Double d2 = o2.getInterestRate();
			return d1.compareTo(d2);
		});
	}

	public static void sortByDuePayment(List<Account> accounts) {
		accounts.sort(Comparator.comparing(Account::getDuePayment));
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
			return Double.compare(account.amount, amount) == 0 && Double.compare(account.interestRate, interestRate) == 0 && duePayment.equals(account.duePayment);
		}

		@Override
		public String toString() {
			return "Account{" + "amount=" + amount + ", interestRate=" + interestRate + ", duePayment=" + duePayment + '}';
		}
	}
}
