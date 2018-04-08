package com.example.studypattern.adapterpattern;

public class MallardDuck implements IDuck {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
