package com.example.studypattern.creational.simplefactory;

/**
 * Created by Administrator on 2018/4/6.
 */
public class Context {
    private IShape strategy;

    public Context(String type)
    {
        this.strategy=ShapeFactory.getShape(type);
    }

    public void draw()
    {
        strategy.draw();
    }
}
