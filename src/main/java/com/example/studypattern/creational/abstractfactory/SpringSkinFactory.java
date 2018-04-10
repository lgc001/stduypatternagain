package com.example.studypattern.creational.abstractfactory;

import com.example.studypattern.creational.abstractfactory.skin.IButton;
import com.example.studypattern.creational.abstractfactory.skin.IComboBox;
import com.example.studypattern.creational.abstractfactory.skin.ITextField;
import com.example.studypattern.creational.abstractfactory.springskin.SpringButton;
import com.example.studypattern.creational.abstractfactory.springskin.SpringComboBox;
import com.example.studypattern.creational.abstractfactory.springskin.SpringTextField;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SpringSkinFactory implements ISkinFactory {
    @Override
    public IButton createButton() {
        return new SpringButton();
    }

    @Override
    public ITextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public IComboBox createComboBox() {
        return new SpringComboBox();
    }
}
