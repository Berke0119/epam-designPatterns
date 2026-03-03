package com.epam.behavioraldesignpatterns.observer;

public class TVChannel implements NewsObserver{

    @Override
    public void update(String news) {
        System.out.println("TV Channel Breaking News: " + news);
    }
}
