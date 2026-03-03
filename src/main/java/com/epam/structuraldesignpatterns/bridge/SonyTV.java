package com.epam.structuraldesignpatterns.bridge;

public class SonyTV implements TV {
    @Override
    public void on() {
        System.out.println("Sony TV on");
    }

    @Override
    public void off() {
        System.out.println("Sony TV off");
    }


}
