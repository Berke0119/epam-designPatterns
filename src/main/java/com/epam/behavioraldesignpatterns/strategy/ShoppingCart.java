package com.epam.behavioraldesignpatterns.strategy;

public class ShoppingCart {

    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(int amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy is not set!");
        }
        strategy.pay(amount);
    }
}
