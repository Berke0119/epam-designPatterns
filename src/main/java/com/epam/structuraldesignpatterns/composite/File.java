package com.epam.structuraldesignpatterns.composite;

public class File implements FileSystemItem {

    private int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
