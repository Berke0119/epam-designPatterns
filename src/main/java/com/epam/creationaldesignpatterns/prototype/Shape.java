package com.epam.creationaldesignpatterns.prototype;

public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {}

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}
