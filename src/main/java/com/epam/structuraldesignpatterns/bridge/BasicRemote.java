package com.epam.structuraldesignpatterns.bridge;

public class BasicRemote extends Remote {

    public BasicRemote(TV tv) {
        super(tv);
    }

    @Override
    public void turnOn() {
        tv.on();
    }
}
