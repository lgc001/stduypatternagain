package com.example.studypattern.creational.factorymethod.factory;

import com.example.studypattern.creational.factorymethod.IShape;
import com.example.studypattern.creational.factorymethod.Square;

/**
 * Created by Administrator on 2018/4/4.
 */
public class SquareFactory implements IShapeFactory {
    @Override
    public IShape createShape() {
        return new Square();
    }
}
