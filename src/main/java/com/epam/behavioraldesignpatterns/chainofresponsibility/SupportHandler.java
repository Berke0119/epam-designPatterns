package com.epam.behavioraldesignpatterns.chainofresponsibility;



public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public void setNext(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issueSeverity);

}
