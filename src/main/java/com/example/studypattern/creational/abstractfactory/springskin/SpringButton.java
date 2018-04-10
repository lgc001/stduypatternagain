package com.example.studypattern.creational.abstractfactory.springskin;

import com.example.studypattern.creational.abstractfactory.skin.IButton;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SpringButton implements IButton {
    @Override
    public void display() {
        System.out.println("显示spring浅绿色按钮。");
    }
}
