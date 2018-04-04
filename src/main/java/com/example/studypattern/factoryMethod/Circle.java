package com.example.studypattern.factoryMethod;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("factoryMethod. Inside Circle::draw() method.");
    }
}
