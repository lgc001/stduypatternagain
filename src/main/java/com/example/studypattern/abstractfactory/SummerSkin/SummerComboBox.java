package com.example.studypattern.abstractfactory.SummerSkin;

import com.example.studypattern.abstractfactory.ISkan.IComboBox;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SummerComboBox implements IComboBox {
    @Override
    public void display() {
        System.out.println("显示summer蓝色边框组合框。");
    }
}
