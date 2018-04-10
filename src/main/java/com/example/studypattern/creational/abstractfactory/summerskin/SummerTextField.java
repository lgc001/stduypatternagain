package com.example.studypattern.creational.abstractfactory.summerskin;

import com.example.studypattern.creational.abstractfactory.skin.ITextField;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SummerTextField implements ITextField {

    @Override
    public void display() {
        System.out.println("显示summer蓝色边框文本框。");
    }
}
