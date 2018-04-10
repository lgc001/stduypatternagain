package com.example.studypattern.creational.abstractfactory.summerskin;

import com.example.studypattern.creational.abstractfactory.skin.IButton;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SummerButton implements IButton {

    @Override
    public void display()
    {
        System.out.println("显示summer浅蓝色按钮。");
    }
}
