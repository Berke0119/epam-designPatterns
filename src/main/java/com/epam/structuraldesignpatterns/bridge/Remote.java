package com.epam.structuraldesignpatterns.bridge;

public abstract class Remote {

    protected TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public abstract void turnOn();



}
