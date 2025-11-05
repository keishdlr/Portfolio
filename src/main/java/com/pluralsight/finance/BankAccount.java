package com.pluralsight.finance;

public class BankAccount implements Valuable {
    String name;
    int accountNumber;
    double balance;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double deposit(){
        balance += amount;
        return balance;
    }

    public double withdraw(){
        balance -= amount;
        return balance;
    }

    @Override
    public double getValue() {
        return -balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
