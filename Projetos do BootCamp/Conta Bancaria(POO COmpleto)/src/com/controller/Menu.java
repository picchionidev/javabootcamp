package com.controller;
import java.util.Scanner;

import com.service.BankSystem;
import com.service.LogInSystem;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    BankSystem bank = new BankSystem();
    LogInSystem login = new LogInSystem(bank);
    public void menu(){
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add account");
            System.out.println("2. List accounts");
            System.out.println("3. Log in to an account");
            System.out.println("4. Exit");
            System.out.print("Choose an operation: ");

            int choice = scanner.nextInt();
            boolean bigloop = false;
            while(!bigloop){
            switch (choice) {
                case 1:
                    bank.addAccount();// Add account logic
                    break;

                case 2:
                    bank.listAccounts();// List accounts logic
                    break;

                case 3:
                    if(login.logInSystem() == true)
                    System.out.println("Senha correta");
                    //MENU DE CONTA
                    else{
                        System.out.println("Senha incorreta");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    bigloop = true;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        }
        
    }
}
