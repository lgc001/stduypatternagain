package com.example.studypattern.behavioral.strategypattern.example2;

public class DefaultFireStrategy implements FireStrategy {
    @Override
    public void fire(Tank t) {
        System.out.println(t.getName() +" 默认开火策略");
    }
}
