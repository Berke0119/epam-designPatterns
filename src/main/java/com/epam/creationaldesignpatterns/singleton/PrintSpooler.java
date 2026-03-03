package com.epam.creationaldesignpatterns.singleton;

public final class PrintSpooler {

    private static PrintSpooler INSTANCE;

    private PrintSpooler() {}

    public static PrintSpooler getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new PrintSpooler();
        }

        return INSTANCE;
    }

}
