package com.example.studypattern.creational.factorymethod;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("factorymethod. Inside Rectangle::draw() method.");
    }
}
