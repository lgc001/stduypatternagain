package com.example.studypattern.factorymethod.factory;

import com.example.studypattern.factorymethod.IShape;
import com.example.studypattern.factorymethod.Square;

/**
 * Created by Administrator on 2018/4/4.
 */
public class SquareFactory implements IShapeFactory {
    @Override
    public IShape createShape() {
        return new Square();
    }
}
