package com.example.studypattern.creational.simplefactory;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("simpleFactory-- Inside Rectangle::draw() method.");
    }
}
