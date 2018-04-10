package com.example.studypattern.creational.simplefactory;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("simpleFactory-- Inside Circle::draw() method.");
    }
}
