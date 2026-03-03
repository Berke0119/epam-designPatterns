package com.epam.structuraldesignpatterns.decorator;

public class SugarCoffee extends CoffeeDecorator {

    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }
}
