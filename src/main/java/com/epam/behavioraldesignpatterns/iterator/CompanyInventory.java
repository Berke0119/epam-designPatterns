package com.epam.behavioraldesignpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompanyInventory implements Iterable<Department> {

    private List<Department> departments = new ArrayList<>();

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    @Override
    public Iterator<Department> iterator() {
        return new DepartmentIterator(this.departments);
    }
}
