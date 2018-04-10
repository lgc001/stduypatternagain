package com.example.studypattern.structural.bridgepattern;

public class SqlDriver extends AbstractBridge {
    @Override
    public void connect() {
        System.out.println("子类的content");
        getDriver().connect();
    }
}
