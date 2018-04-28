package com.company;

public class Account {
    private double accountBalance;

    public Account(){
        accountBalance = 0;
    }

    public Account(double initialDeposit){
        accountBalance = initialDeposit;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double deposit(double amount)
        throws InsufficientFundsException{
        if(amount > 0){
            accountBalance += amount;
        }else{
            throw new InsufficientFundsException("Cannot deposit a negative amount.");
        }
        return accountBalance;
    }

    public double withdraw(double amount)
        throws InsufficientFundsException{
        if(amount > accountBalance){
            throw new InsufficientFundsException("Cannot withdraw more than your balance.");
        }else if(amount > 0){
            throw new InsufficientFundsException("Cannot withdraw a negative amount.");
        }else{
            accountBalance -= amount;
        }
        return amount;
    }
}
