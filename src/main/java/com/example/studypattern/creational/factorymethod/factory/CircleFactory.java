package com.example.studypattern.creational.factorymethod.factory;

import com.example.studypattern.creational.factorymethod.Circle;
import com.example.studypattern.creational.factorymethod.IShape;

/**
 * Created by Administrator on 2018/4/4.
 */
public class CircleFactory implements IShapeFactory {
    @Override
    public IShape createShape() {
        return new Circle();
    }
}
