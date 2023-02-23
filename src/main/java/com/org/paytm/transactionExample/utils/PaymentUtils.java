package com.org.paytm.transactionExample.utils;

import com.org.paytm.transactionExample.Exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String, Double > paymentMap = new HashMap<>();

    static{
        paymentMap.put("acc1", 12000.0);
        paymentMap.put("acc2", 10000.0);
        paymentMap.put("acc3", 2000.0);
        paymentMap.put("acc1", 20000.0);
    }

    public static Boolean validateCreditLimit(String accNo, Double payAmount){
        if(payAmount > paymentMap.get(accNo)){
            throw new InsufficientAmountException("Insufficient Balance In Account");
        } else{
            return true;
        }
    }

}
