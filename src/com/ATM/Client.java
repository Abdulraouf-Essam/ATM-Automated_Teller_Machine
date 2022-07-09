package com.ATM;

import java.util.Date;

public class Client
{
    private String Name;
    private String The_Last_Withdrawal;
    private long Account_Number;
    private int Password;
    private double Balance;
    static long Number_Of_Account = Long.valueOf(12345678910L);

    Client()
    {
        Number_Of_Account++;
        Account_Number = Number_Of_Account;
    }

    // Name
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    // Account_Number
    public long getAccount_Number() {
        return Account_Number;
    }
    public void setAccount_Number(long account_Number) {
        Account_Number = account_Number;
    }

    // Password
    public int getPassword() {
        return Password;
    }
    public void setPassword(int password) {
        Password = password;
    }

    // Balance
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }

    // The_Last_Withdrawal
    public String getThe_Last_Withdrawal() {
        return The_Last_Withdrawal;
    }
    public void setThe_Last_Withdrawal(String data) { The_Last_Withdrawal = data; }

   //Withdrawal
    public void Withdrawal(double Amount){
        if(Amount<=0) System.out.println("The number you entered is incorrect, enter a positive number");
        else if(Amount>=Balance) Balance-=Amount;
        else System.out.println("Sorry, there is not enough balance...");
    }

    //deposit
    public void Deposit(double Amount) {
        if(Amount<=0) System.out.println("The number you entered is incorrect, enter a positive number");
        else Balance+=Amount;
    }

    public void Display_Client_Information() {
        System.out.println("=> The Name : " + Name + "\n" +
                           "=> The Account Number : " + Account_Number + "\n" +
                           "=> The Balance = $ " + Balance + "\n" +
                           "=> The Last Withdrawal : " + The_Last_Withdrawal);
    }
}
