package com.epam.structuraldesignpatterns.flyweight;

public class TreeType {

    private String type;
    private String texture;

    public TreeType(String type, String texture) {
        this.type = type;
        this.texture = texture;
    }

    public void draw(int x, int y){
        System.out.println("Drawing " + type + " at " + x + ", " + y);
    }
}
