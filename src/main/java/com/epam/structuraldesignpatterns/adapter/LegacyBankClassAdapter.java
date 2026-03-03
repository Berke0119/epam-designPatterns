package com.epam.structuraldesignpatterns.adapter;

public class LegacyBankClassAdapter extends LegacyBankApi implements PaymentProcessor{

    //If we want we can override make payment also

    @Override
    public void pay(double amount) {
        makePayment(amount);
    }
}
