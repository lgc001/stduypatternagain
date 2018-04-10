package com.example.studypattern.behavioral.observerpattern;

public class User implements IObserver {

    private String message;
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    private void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }
}
