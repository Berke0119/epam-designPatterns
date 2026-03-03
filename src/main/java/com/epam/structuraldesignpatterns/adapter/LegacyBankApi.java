package com.epam.structuraldesignpatterns.adapter;

public class LegacyBankApi {

    public void makePayment(double value){
        System.out.println("Legacy Payment" + value);
    }
}
