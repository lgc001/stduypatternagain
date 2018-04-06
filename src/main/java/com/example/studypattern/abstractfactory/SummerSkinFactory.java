package com.example.studypattern.abstractfactory;

import com.example.studypattern.abstractfactory.ISkan.IButton;
import com.example.studypattern.abstractfactory.ISkan.IComboBox;
import com.example.studypattern.abstractfactory.ISkan.ITextField;
import com.example.studypattern.abstractfactory.SpringSkin.SpringComboBox;
import com.example.studypattern.abstractfactory.SummerSkin.SummerButton;
import com.example.studypattern.abstractfactory.SummerSkin.SummerTextField;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SummerSkinFactory implements ISkinFactory {
    @Override
    public IButton createButton() {
        return new SummerButton();
    }

    @Override
    public ITextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public IComboBox createComboBox() {
        return new SpringComboBox();
    }
}
