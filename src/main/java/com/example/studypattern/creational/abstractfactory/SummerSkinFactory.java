package com.example.studypattern.creational.abstractfactory;

import com.example.studypattern.creational.abstractfactory.skin.IButton;
import com.example.studypattern.creational.abstractfactory.skin.IComboBox;
import com.example.studypattern.creational.abstractfactory.skin.ITextField;
import com.example.studypattern.creational.abstractfactory.springskin.SpringComboBox;
import com.example.studypattern.creational.abstractfactory.summerskin.SummerButton;
import com.example.studypattern.creational.abstractfactory.summerskin.SummerTextField;

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
