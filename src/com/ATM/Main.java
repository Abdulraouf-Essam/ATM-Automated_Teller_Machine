package com.ATM;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Operations.Auto_fill_in_data();
        Scanner Input = new Scanner(System.in);

        char Number_Of_Operation;
        while(true)
        {
            System.out.println("                     MAIN MENU \n\n");
            System.out.println(" 01. To Create an new account, click        \\\" 1 \\\"");
            System.out.println(" 02. To Inquire about an account, click     \\\" 2 \\\"");
            System.out.println(" 03. Balance transfer, click                \\\" 3 \\\"");
            System.out.println(" 04. For Pull , click                       \\\" 4 \\\"");
            System.out.println(" 05. For deposit , click                    \\\" 5 \\\"");
            System.out.println(" 06. To Exit the program, click             \\\" 6 \\\"");

            Number_Of_Operation = Input.next().charAt(0);

            switch (Number_Of_Operation)
            {
                case '1': Operations.Create_New_Account(); break;
                case '2': Operations.Display_Client_Information(); break;
                case '3': Operations.Balance_transfer(); break;
                case '4': Operations.Pull(); break;
                case '5': Operations.withdraw(); break;
                case '6': return;
                default: System.out.println("The transaction number is incorrect, try again...");
            }
        }
    }


}
