package com.ATM;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
public class Operations
{
    static Scanner Input = new Scanner(System.in);
    static Client [] Arr=new Client[100005];
    static int Size = 0;

    // Auto fill in data

    public static void Auto_fill_in_data()
    {
        Client New_client = new Client();

        New_client.setName("Ahmed Ali");
        New_client.setPassword(123456789);
        New_client.setBalance(500.25);
        Arr[Size++] = New_client;

        New_client = new Client();
        New_client.setName("Ali Salah");
        New_client.setPassword(9874589);
        New_client.setBalance(1111.258);
        Arr[Size++] = New_client;

        New_client = new Client();
        New_client.setName("Karem syied");
        New_client.setPassword(1478541);
        New_client.setBalance(9899.11);
        Arr[Size++] = New_client;

        New_client = new Client();
        New_client.setName("Abdo Ali");
        New_client.setPassword(85236415);
        New_client.setBalance(999999.36);
        Arr[Size++] = New_client;

        New_client = new Client();
        New_client.setName("Ahmed Syied");
        New_client.setPassword(85463115);
        New_client.setBalance(88888.3214);
        Arr[Size++] = New_client;

        New_client = new Client();
        New_client.setName("Ahmed Adam");
        New_client.setPassword(888845265);
        New_client.setBalance(112436.258);
        Arr[Size++] = New_client;

        New_client = new Client();
        New_client.setName("Ahmed Syied");
        New_client.setPassword(85463115);
        New_client.setBalance(88888.3214);
        Arr[Size++] = New_client;
    }



    //Create_New_Account

    public static void Create_New_Account()
    {

        String Name; double Balance; int Password;

        Client New_client = new Client();

        System.out.println("Please Enter your Name...");
        Name = Input.nextLine();  New_client.setName(Name);

        System.out.println("Please Enter your Password...");
        Password = Input.nextInt(); New_client.setPassword(Password);

        System.out.println("Please Enter the amount to be deposited...");
        Balance = Input.nextDouble(); New_client.setBalance(Balance);

        Arr[Size++] = New_client;
    }

    // Display_Client_Information

    public static void Display_Client_Information()
    {
        long Account_Number;
        int Clint;
        System.out.println("Enter your Account_Number...");
        Account_Number = Input.nextLong();
        Clint = Search(Account_Number);
        if(Clint != -1) Arr[Clint].Display_Client_Information();
    }

    // Balance_transfer

    public static void Balance_transfer()
    {
        long Account_Number_1, Account_Number_2;
        int Clint_1, Clint_2;
        double Amount;
        System.out.println("Enter your Account_Number...");
        Account_Number_1 = Input.nextLong();
        Clint_1 = Search(Account_Number_1);

        System.out.println("Enter the account number you want to transfer to...");
        Account_Number_2 = Input.nextLong();
        Clint_2 = Search(Account_Number_2);

        System.out.println("Enter the money to be transferred...");
        Amount = Input.nextDouble();

        Arr[Clint_2].setBalance(Arr[Clint_2].getBalance() + Amount);
        Arr[Clint_1].setBalance(Arr[Clint_1].getBalance() - Amount);
    }

    // Pull

    public static void Pull()
    {
        long Account_Number;
        double pull_Amount;
        int Clint;
        System.out.println("Enter your Account_Number...");
        Account_Number = Input.nextLong();
        Clint = Search(Account_Number);

        System.out.println("Enter the money you want to Pull...");
        pull_Amount = Input.nextDouble();

        if(Clint != -1) Arr[Clint].setBalance(Arr[Clint].getBalance() + pull_Amount);
    }

    // withdraw

    public static void withdraw()
    {
        long Account_Number;
        double withdraw_Amount;
        int Clint;
        System.out.println("Enter your Account_Number...");
        Account_Number = Input.nextLong();
        Clint = Search(Account_Number);

        System.out.println("Enter the money you want to withdraw...");
        withdraw_Amount = Input.nextDouble();

        if(Clint != -1)
        {
            Arr[Clint].setBalance(Arr[Clint].getBalance() - withdraw_Amount);

            SimpleDateFormat S_D_Format = new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
            String str_Date = S_D_Format.format(date);
            Arr[Clint].setThe_Last_Withdrawal(str_Date);
        }
    }


    // Search

    public static int Search(long Account_Number)
    {
        int Exist = 1;

        while(true)
        {
            for(int i=0;i<Size;i++)
                if(Account_Number==Arr[i].getAccount_Number()) return i;

            System.out.println("There is no account with this number. To try again click \" 1 \"        Or Exist click \" 2 \" ");
            Exist = Input.nextInt();

            if(Exist == 1)
            {
                System.out.println("Enter your Account_Number...");
                Account_Number = Input.nextLong();
            }
            else break;
        }

        return -1;
    }

}
