package com.epam.behavioraldesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    List<NewsObserver> observers = new ArrayList<>();
    private String latestNews;

    public void addObserver(NewsObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(NewsObserver observer) {
        observers.remove(observer);
    }

    public void setNews(String news) {
        latestNews = news;
        notifyObservers();
    }

    public void notifyObservers() {
        for (NewsObserver observer : observers) {
            observer.update(latestNews);
        }
    }

}
