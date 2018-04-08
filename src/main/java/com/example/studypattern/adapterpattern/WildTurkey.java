package com.example.studypattern.adapterpattern;

public class WildTurkey implements ITurkey {
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
