package com.pluralsight;

public class BankAccount implements Valuable{
    String name;
    int accountNumber;
    double balance;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
