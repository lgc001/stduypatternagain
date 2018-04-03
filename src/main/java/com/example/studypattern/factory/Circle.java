package com.example.studypattern.factory;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
