package com.example.studypattern.creational.abstractfactory.summerskin;

import com.example.studypattern.creational.abstractfactory.skin.IComboBox;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SummerComboBox implements IComboBox {
    @Override
    public void display() {
        System.out.println("显示summer蓝色边框组合框。");
    }
}
