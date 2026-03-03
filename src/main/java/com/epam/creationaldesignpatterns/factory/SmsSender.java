package com.epam.creationaldesignpatterns.factory;

public class SmsSender implements NotificationSender{


    @Override
    public String type() {
        return "SMS";
    }

    @Override
    public void send(String message) {
        System.out.println("Sending sms: " + message);
    }
}
