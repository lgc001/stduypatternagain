package com.example.studypattern.factoryMethod.factory;

import com.example.studypattern.factoryMethod.Circle;
import com.example.studypattern.factoryMethod.IShape;

/**
 * Created by Administrator on 2018/4/4.
 */
public class CircleFactory implements IShapeFactory {
    @Override
    public IShape createShape() {
        return new Circle();
    }
}
