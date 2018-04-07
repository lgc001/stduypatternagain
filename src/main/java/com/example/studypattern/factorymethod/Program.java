package com.example.studypattern.factorymethod;

import com.example.studypattern.factorymethod.factory.CircleFactory;
import com.example.studypattern.factorymethod.factory.IShapeFactory;
import com.example.studypattern.factorymethod.factory.RectangleFactory;
import com.example.studypattern.factorymethod.factory.SquareFactory;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Program {
    public static void main(String[] args)
    {
        //获取 Circle 的对象，并调用它的 draw 方法
        draw(new CircleFactory());

        //获取 Rectangle 的对象，并调用它的 draw 方法
        draw(new RectangleFactory());

        //获取 Square 的对象，并调用它的 draw 方法
        draw(new SquareFactory());
    }

    public static void draw(IShapeFactory shapeFactory)
    {
        shapeFactory.createShape().draw();
    }
}