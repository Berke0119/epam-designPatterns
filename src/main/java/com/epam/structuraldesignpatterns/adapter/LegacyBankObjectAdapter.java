package com.epam.structuraldesignpatterns.adapter;

public class LegacyBankObjectAdapter implements PaymentProcessor {

    private final LegacyBankApi legacyBankApi;

    public LegacyBankObjectAdapter(LegacyBankApi legacyBankApi) {
        this.legacyBankApi = legacyBankApi;
    }

    @Override
    public void pay(double amount) {
        legacyBankApi.makePayment(amount);
    }
}
