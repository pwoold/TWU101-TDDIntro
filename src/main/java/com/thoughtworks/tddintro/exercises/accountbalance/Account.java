package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private int balance;

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public void deposit(int i) {
        balance = balance + i;
    }
    public int getBalance() {
        return balance;
    }
}
