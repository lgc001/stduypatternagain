package com.example.studypattern.abstractfactory;

import com.example.studypattern.abstractfactory.ISkan.IButton;
import com.example.studypattern.abstractfactory.ISkan.IComboBox;
import com.example.studypattern.abstractfactory.ISkan.ITextField;

/**
 * Created by Administrator on 2018/4/6.
 */
public interface ISkinFactory {

    IButton createButton();
    ITextField createTextField();
    IComboBox createComboBox();
}
