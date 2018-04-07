package com.example.studypattern.factorymethod.factory;

import com.example.studypattern.factorymethod.Circle;
import com.example.studypattern.factorymethod.IShape;

/**
 * Created by Administrator on 2018/4/4.
 */
public class CircleFactory implements IShapeFactory {
    @Override
    public IShape createShape() {
        return new Circle();
    }
}
