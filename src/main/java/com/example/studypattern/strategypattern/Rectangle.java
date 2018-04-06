package com.example.studypattern.strategypattern;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("stategyPattern-- Inside Rectangle::draw() method.");
    }
}
