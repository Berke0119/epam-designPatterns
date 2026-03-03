package com.epam.structuraldesignpatterns.memento;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> history = new Stack<>();

    public void save(Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        return history.pop();
    }
}
