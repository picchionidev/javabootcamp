package com.service;
import java.util.Scanner;

import com.models.Account;

public class LogInSystem{
    
    private int logInNumber;
    
    private int logInPassword;
    
    Scanner scanner = new Scanner(System.in);
   
    BankSystem bank = new BankSystem(); 
    
    // Construtor que recebe o BankSystem
    public LogInSystem(BankSystem bank) {
        this.bank = bank;  // Agora o LogInSystem sabe sobre o bank criado 
    }    
    public boolean logInSystem(){
        dataRequest();
        //Log in Logic
        if(findAccountByNumber(logInNumber).getFournumberspassword() == logInPassword){
            return true;
        }//passou
        else{
            return false;
        }


        //Lemmbrar de passar o numero da conta para os metodos deposito,scaque e transferrencia
    }
    public void dataRequest(){
        System.out.println("Log-in\n");
        System.out.println("Account's number\n");
        logInNumber = scanner.nextInt();
        System.out.println("Password(4 numbers):\n");
        logInPassword = scanner.nextInt();
    }
    public Account findAccountByNumber(int accountNumber) {
        for (Account account : bank.accounts) {
            if (account.getNumber() == accountNumber) {
                return account;  // Retorna a conta se o número for encontrado
            }
            
        }
        return null;  // Retorna null se a conta não for encontrada
}
}
