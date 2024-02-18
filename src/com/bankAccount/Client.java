package com.bankAccount;

import java.util.ArrayList;

public class Client {


    private int ID;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    Client(int ID, String name, String phone){
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.accounts = new ArrayList<>();
    }

    public boolean addAccount(Account account){

        boolean accountAdded;
        accountAdded = this.accounts.add(account);
        if(accountAdded){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean removeAccount(int accountID){

        for(int i = 0; i < accounts.size(); i++){
            if(this.accounts.get(i).getID() == accountID){
                this.accounts.remove(this.accounts.get(i));
                return true;
            }
        }
        return false;

    }

    public String toString(){

        String outputString1 = "Client ID: " + this.ID +
                                "\n Client name: " + this.name +
                                "\n Client phone: " + this.phone +
                                "\n \n Client accounts: \n";
        for(Account account : accounts){
            outputString1 += account.toString() + "\n";
        }
        return outputString1;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Account> getAccount() {
        return accounts;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAccount(ArrayList<Account> account) {
        this.accounts = account;
    }
}
