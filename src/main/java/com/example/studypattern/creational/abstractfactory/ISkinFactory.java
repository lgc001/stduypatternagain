package com.example.studypattern.creational.abstractfactory;

import com.example.studypattern.creational.abstractfactory.skin.IButton;
import com.example.studypattern.creational.abstractfactory.skin.IComboBox;
import com.example.studypattern.creational.abstractfactory.skin.ITextField;

/**
 * Created by Administrator on 2018/4/6.
 */
public interface ISkinFactory {

    IButton createButton();
    ITextField createTextField();
    IComboBox createComboBox();
}
