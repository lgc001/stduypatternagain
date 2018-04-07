package com.example.studypattern.factorymethod;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("factorymethod. Inside Circle::draw() method.");
    }
}
