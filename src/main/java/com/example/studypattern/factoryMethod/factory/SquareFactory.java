package com.example.studypattern.factoryMethod.factory;

import com.example.studypattern.factoryMethod.IShape;
import com.example.studypattern.factoryMethod.Square;

/**
 * Created by Administrator on 2018/4/4.
 */
public class SquareFactory implements IShapeFactory {
    @Override
    public IShape createShape() {
        return new Square();
    }
}
