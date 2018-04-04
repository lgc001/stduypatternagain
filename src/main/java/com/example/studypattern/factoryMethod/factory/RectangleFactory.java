package com.example.studypattern.factoryMethod.factory;

import com.example.studypattern.factoryMethod.IShape;
import com.example.studypattern.factoryMethod.Rectangle;

/**
 * Created by Administrator on 2018/4/4.
 */
public class RectangleFactory implements IShapeFactory {
    @Override
    public IShape createShape() {
        return new Rectangle();
    }
}
