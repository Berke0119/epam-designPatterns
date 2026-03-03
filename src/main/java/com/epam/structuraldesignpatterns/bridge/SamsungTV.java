package com.epam.structuraldesignpatterns.bridge;

public class SamsungTV implements TV {


    @Override
    public void on() {
        System.out.println("Samsung TV on");
    }

    @Override
    public void off() {
        System.out.println("Samsung TV off");
    }
}
