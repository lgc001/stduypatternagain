package com.example.studypattern.creational.factorymethod;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("factorymethod. Inside Square::draw() method.");
    }
}
