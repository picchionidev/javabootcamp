package com.service;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.models.Account;
import com.models.CheckingAccount;
import com.models.SavingsAccount;

public  class BankSystem {
    public ArrayList<Account> accounts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    
    public void addAccount(){
        
        System.out.println("Holder's name:");
        String name = scanner.nextLine();
        System.out.println("Account's Type(1-Checking Account 2-Savings Account)");
        int accountType = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Type your new 4-number password:");
        int password = scanner.nextInt();
        scanner.nextLine();
    
            if(accountType==1){
            Account newaccount = new CheckingAccount(name,0,generateRandomAccountNumber(),password);
            accounts.add(newaccount);

            }
            else if(accountType==2){
            Account newaccount = new SavingsAccount(name,0,generateRandomAccountNumber(),password);
            accounts.add(newaccount);
            }

        


    }
    private int generateRandomAccountNumber() {
        int digits = 4;
        int min = (int) Math.pow(10, digits - 1);  // Menor número com '4' dígitos (1000)
        int max = (int) Math.pow(10, digits) - 1;  // Maior número com '4' dígitos (9999)

        Random random = new Random();
        int accountNumber;

        // Gerar um número aleatório e verificar se já existe
        do {
            accountNumber = random.nextInt(max - min + 1) + min;
        } while (accountNumberExists(accountNumber));  // Verificar se já existe na lista

        // Retorna o número de conta único
        return accountNumber;
    }
    private boolean accountNumberExists(int number) {
        for (Account account : accounts) {
            if (account.getNumber() == number) {
                return true;
            }
        }
        return false;
    }

    public void listAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Number: \n" + account.getNumber());
            System.out.println("Holder: \n" + account.getHolder());
            System.out.println("Balance: \n" + account.getBalance());
            System.out.println("---\n");
        }
    }

}