package com.epam.structuraldesignpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {

    private List<FileSystemItem> items = new ArrayList<>();

    @Override
    public int getSize() {
        int total = 0;

        for(FileSystemItem item : items) {
            total += item.getSize();
        }

        return total;
    }
}
