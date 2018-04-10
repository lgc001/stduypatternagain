package com.example.studypattern.behavioral.strategypattern;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("stategyPattern-- Inside Square::draw() method.");
    }
}
