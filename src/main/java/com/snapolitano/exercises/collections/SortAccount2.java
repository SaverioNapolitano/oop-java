package com.snapolitano.exercises.collections;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortAccount2 {
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

        public Account(double amount, double interestRate, LocalDate duePayment) {
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

        public LocalDate getDuePayment() {
            return duePayment;
        }

        public void setDuePayment(LocalDate duePayment) {
            this.duePayment = duePayment;
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
        public int hashCode() {
            return Objects.hash(amount, interestRate, duePayment);
        }

        @Override
        public String toString() {
            return "Account{" + "amount=" + amount + ", interestRate=" + interestRate + ", duePayment=" + duePayment + '}';
        }
    }

    public static void sortByAmount(List<Account> accounts){
        accounts.sort((Comparator.comparingDouble(Account::getAmount)));
    }
    public static void sortByInterestRate(List<Account> accounts){
        accounts.sort(Comparator.comparingDouble(Account::getInterestRate));
    }
    public static void sortByDuePayment(List<Account> accounts){
        accounts.sort(Comparator.comparing(Account::getDuePayment));
    }
}
