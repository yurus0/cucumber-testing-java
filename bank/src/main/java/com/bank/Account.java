package com.bank;

public class Account {
    private int balance;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public int getBalance(){
        return balance;
    }
}
