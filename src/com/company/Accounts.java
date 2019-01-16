package com.company;

public class Accounts {

    private int phoneNumber;
    private String name;
    private String email;
    private String accountNumber;
    private double balance;


    // Let user make a deposit
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is: "
        + this.balance);
    }

    // Let user make a withdrawal
    public void withdrawal(double withdrawalAmount) {
        if(balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount
            + " processed. Remaining balance = " + this.balance);
        }
    }

    // balance getter and setter
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;

    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    // Balance getter and setter
    public void setBalance(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return this.balance;
    }

    // name getter and setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // email getter and setter
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.name;
    }

    // Phone number getter and setter
    public void setPhoneNumber(int phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

}
