package com.models;
public class Account {
    private String holder;
    private int number;
    private double balance;
    private int fournumberspassword;
    
    
    

    
    public int getFournumberspassword() {
        return fournumberspassword;
    }
    public void setFournumberspassword(int fournumberspassword) {
        this.fournumberspassword = fournumberspassword;
    }
    public Account(String holder, int number, double balance, int fournumberspassword) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
        this.fournumberspassword = fournumberspassword;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
