package com.epam.structuraldesignpatterns.interpreter;

public class BooleanExpression implements Expression {

    private boolean value;

    public BooleanExpression(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret() {
        return value;
    }
}
