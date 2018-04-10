package com.example.studypattern.creational.abstractfactory.springskin;

import com.example.studypattern.creational.abstractfactory.skin.ITextField;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SpringTextField implements ITextField {

    @Override
    public void display()
    {
        System.out.println("显示spring绿色边框文本框。");
    }
}
