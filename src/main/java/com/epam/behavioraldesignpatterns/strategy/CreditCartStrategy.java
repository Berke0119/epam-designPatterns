package com.epam.behavioraldesignpatterns.strategy;

public class CreditCartStrategy implements PaymentStrategy {

    private String cardNumber;

    public CreditCartStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card ending with: " + cardNumber.substring(12));
    }
}
