package com.epam.behavioraldesignpatterns.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class DepartmentIterator implements Iterator<Department> {

    private List<Department> departments;
    private int cursor = 0;

    public DepartmentIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return cursor < departments.size();
    }

    @Override
    public Department next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return departments.get(cursor++);
    }
}
