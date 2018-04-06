package com.example.studypattern.simplefactory;

/**
 * Created by Administrator on 2018/4/6.
 */
public class Context {
    private IShape strategy;

    public Context(String type)
    {
        ShapeFactory shapeFactory=new ShapeFactory();

        this.strategy=shapeFactory.getShape(type);
    }

    public void draw()
    {
        strategy.draw();
    }
}
