package com.example.studypattern.strategypattern;

import com.example.studypattern.simplefactory.ShapeFactory;

/**
 * Created by Administrator on 2018/4/6.
 */
public class Context {
    private IShape strategy;

    public Context(IShape strategy)
    {
        this.strategy=strategy;
    }

    public void draw()
    {
        strategy.draw();
    }
}
