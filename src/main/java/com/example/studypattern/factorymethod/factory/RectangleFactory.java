package com.example.studypattern.factorymethod.factory;

import com.example.studypattern.factorymethod.IShape;
import com.example.studypattern.factorymethod.Rectangle;

/**
 * Created by Administrator on 2018/4/4.
 */
public class RectangleFactory implements IShapeFactory {
    @Override
    public IShape createShape() {
        return new Rectangle();
    }
}
