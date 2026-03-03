package com.epam.structuraldesignpatterns.bridge;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(TV tv) {
        super(tv);
    }

    @Override
    public void turnOn() {
        tv.on();
    }

    public void mute(){
        System.out.println("Muted");
    }
}
