package com.epam.creationaldesignpatterns.factory;

public class EmailSender implements NotificationSender{


    @Override
    public String type() {
        return "EMAIL";
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
