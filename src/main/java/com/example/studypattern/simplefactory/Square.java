package com.example.studypattern.simplefactory;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
