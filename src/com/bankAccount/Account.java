package com.bankAccount;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Account {

    private int ID;
    private double balance;
    private double interestRate;
    private Date dateCreated;

    public Account(int ID, double balance, double interestRate){
        this.ID = ID;
        this.balance = balance;
        this.interestRate = interestRate;
        this.dateCreated = new Date();
    }

    public boolean withdraw(double amount){
        if(balance < amount){
            return false;
        }
        balance -= amount;
        return true;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public int getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String toString(){
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        String strDate = dateFormat.format(dateCreated);
        String outputString = "Account ID: " + this.ID + "\n" +
                              "Account balance: " + this.balance + "\n" +
                              "Annual Interest Rate: " + this.interestRate + "\n" +
                              "Account Date Created: " + strDate;
        return outputString;
    }

}