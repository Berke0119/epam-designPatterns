package com.epam.creationaldesignpatterns.factory;

public interface NotificationSender {

    String type();
    void send(String message);
}
