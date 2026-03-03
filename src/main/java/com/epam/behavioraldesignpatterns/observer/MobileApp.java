package com.epam.behavioraldesignpatterns.observer;

public class MobileApp implements NewsObserver{
    @Override
    public void update(String news) {
        System.out.println("Mobile App Notification: " + news);
    }
}
