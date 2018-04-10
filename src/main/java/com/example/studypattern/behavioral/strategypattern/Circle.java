package com.example.studypattern.behavioral.strategypattern;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("stategyPattern-- Inside Circle::draw() method.");
    }
}
