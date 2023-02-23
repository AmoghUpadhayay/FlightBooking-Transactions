package com.org.paytm.transactionExample.Exception;

public class InsufficientAmountException extends RuntimeException{
    public InsufficientAmountException(String message){
        super(message);
    }
}
