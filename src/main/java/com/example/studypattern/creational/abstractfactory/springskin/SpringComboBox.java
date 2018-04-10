package com.example.studypattern.creational.abstractfactory.springskin;

import com.example.studypattern.creational.abstractfactory.skin.IComboBox;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SpringComboBox implements IComboBox {
    @Override
    public void display() {
        System.out.println("显示spring绿色边框组合框。");
    }
}
