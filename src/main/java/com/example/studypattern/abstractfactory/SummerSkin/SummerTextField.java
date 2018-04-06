package com.example.studypattern.abstractfactory.SummerSkin;

import com.example.studypattern.abstractfactory.ISkan.ITextField;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SummerTextField implements ITextField {

    @Override
    public void display() {
        System.out.println("显示summer蓝色边框文本框。");
    }
}
