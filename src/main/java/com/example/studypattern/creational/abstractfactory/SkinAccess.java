package com.example.studypattern.creational.abstractfactory;

import com.example.studypattern.creational.abstractfactory.skin.IButton;
import com.example.studypattern.creational.abstractfactory.skin.IComboBox;
import com.example.studypattern.creational.abstractfactory.skin.ITextField;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SkinAccess {

    @Value("${appconfig.abstactFactotySkin}")
    private static String skinFacoty="springskin";

    private static ISkinFactory getSkinFactory()
    {
        //通过类名生成实例对象并将其返回
        ISkinFactory obj= null;
        Class c= null;
        try {
            c = Class.forName("com.example.studypattern.creational.abstractfactory."+skinFacoty+"Factory");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            obj = (ISkinFactory)c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }

    public static IButton createButton() {
        //ISkinFactory factory = (ISkinFactory)XMLUtil.getBean1();
        ISkinFactory factory = getSkinFactory();
        return factory.createButton();
    }

    public static ITextField createTextField() {
        ISkinFactory factory = getSkinFactory();
        return factory.createTextField();
    }

    public static IComboBox createComboBox() {
        ISkinFactory factory = getSkinFactory();
        return factory.createComboBox();
    }
}
