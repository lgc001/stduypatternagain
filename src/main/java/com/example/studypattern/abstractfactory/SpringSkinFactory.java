package com.example.studypattern.abstractfactory;

import com.example.studypattern.abstractfactory.ISkan.IButton;
import com.example.studypattern.abstractfactory.ISkan.IComboBox;
import com.example.studypattern.abstractfactory.ISkan.ITextField;
import com.example.studypattern.abstractfactory.SpringSkin.SpringButton;
import com.example.studypattern.abstractfactory.SpringSkin.SpringComboBox;
import com.example.studypattern.abstractfactory.SpringSkin.SpringTextField;

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
