package com.bankAccount;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account(1, 1000, 4.5);
        Account account2 = new Account(2, 2000, 5.5);

        Client client1 = new Client(100, "Amaan Ahmad", "1234567890");
        client1.addAccount(account1);
        client1.addAccount(account2);

        System.out.println("Client Information:");
        System.out.println(client1);

        Transaction transaction1 = new Transaction(account1, account2, 500);
        System.out.println("\nTransaction Details:");
        System.out.println(transaction1);

        transaction1.executeTransaction();

        System.out.println("\nUpdated Client Information:");
        System.out.println(client1);
    }
}
