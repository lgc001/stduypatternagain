package com.example.studypattern.abstractfactory.SpringSkin;

import com.example.studypattern.abstractfactory.ISkan.ITextField;

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
