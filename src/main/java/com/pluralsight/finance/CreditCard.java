package com.pluralsight.finance;

public class CreditCard implements Valuable {
    String name;
    String accountNumber;
    double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double amount = 0;
    public double charge(){
        balance += amount;
        return balance;
    }

    public double pay(){
        balance -= amount;
        return balance;
    }

    @Override
    public double getValue() {
        return -balance;
    }
}
