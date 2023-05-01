package com.snapolitano.exercises.functional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BankAccount {
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

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDateTime getDuePayment() {
            return duePayment;
        }

        public void applyInterest() {
            this.amount += this.getAmount() * this.getInterestRate();
        }
    }

    public static List<Account> applyInterest(List<Account> accounts) {
        return accounts.stream().filter(account -> account.getDuePayment().isBefore(LocalDateTime.now())).peek(Account::applyInterest).sorted(((o1, o2) -> Double.compare(o2.getAmount(), o1.getAmount()))).collect(Collectors.toList());
    }
}
