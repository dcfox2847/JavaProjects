package com.company;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(100);
        try{
            account.withdraw(20);
        }catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

        try{
            account.deposit(-45);
        }catch (InsufficientFundsException e){
            System.out.println("You cannot deposit a negative number...");
        }



    }
}
