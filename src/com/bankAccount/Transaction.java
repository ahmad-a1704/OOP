package com.bankAccount;

import java.util.Date;

public class Transaction {

    private static int transactionIdCounter = 1000; // Initial value for the transaction ID counter
    private int transactionID;
    private Account sourceAccount;
    private Account destinationAccount;
    private double amount;
    private Date timestamp;

    public Transaction(Account sourceAccount, Account destinationAccount, double amount) {
        this.transactionID = transactionIdCounter++;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public int getTransactionID() {
        return transactionID;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public Account getDestinationAccount() {
        return destinationAccount;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void executeTransaction() {
        if (sourceAccount.withdraw(amount)) {
            destinationAccount.deposit(amount);
            System.out.println("Transaction ID " + transactionID + " executed successfully.");
        } else {
            System.out.println("Transaction ID " + transactionID + " failed: Insufficient funds.");
        }
    }

    public String toString() {
        return "Transaction ID: " + transactionID +
                "\nSource Account: " + sourceAccount.getID() +
                "\nDestination Account: " + destinationAccount.getID() +
                "\nAmount: " + amount +
                "\nTimestamp: " + timestamp;
    }
}
