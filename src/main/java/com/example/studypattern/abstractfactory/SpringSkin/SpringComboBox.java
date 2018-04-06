package com.example.studypattern.abstractfactory.SpringSkin;

import com.example.studypattern.abstractfactory.ISkan.IComboBox;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SpringComboBox implements IComboBox {
    @Override
    public void display() {
        System.out.println("显示spring绿色边框组合框。");
    }
}
