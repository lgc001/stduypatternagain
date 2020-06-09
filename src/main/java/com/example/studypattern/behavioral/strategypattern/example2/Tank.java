package com.example.studypattern.behavioral.strategypattern.example2;

import jdk.nashorn.internal.objects.annotations.Getter;

public class Tank {
    private String name;
    public Tank(){}

    public Tank(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void fire(FireStrategy strategy){
        strategy.fire(this);
    }
}
