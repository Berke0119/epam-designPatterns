package com.epam.structuraldesignpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static final Map<String, TreeType> cache = new HashMap<>();

    public static TreeType getTreeType(String type, String texture){
        if(!cache.containsKey(type)){
            cache.put(type, new TreeType(type, texture));
        }

        return cache.get(type);
    }
}
