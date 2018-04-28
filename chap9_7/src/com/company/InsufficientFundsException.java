package com.company;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String warning){
        super(warning);
    }
}
