package com.example.studypattern.abstractfactory;

import com.example.studypattern.abstractfactory.ISkan.IButton;
import com.example.studypattern.abstractfactory.ISkan.IComboBox;
import com.example.studypattern.abstractfactory.ISkan.ITextField;
import com.example.studypattern.abstractfactory.SpringSkin.SpringButton;
import com.example.studypattern.abstractfactory.SpringSkin.SpringComboBox;
import com.example.studypattern.abstractfactory.SpringSkin.SpringTextField;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Administrator on 2018/4/6.
 */
public class SkinAccess {

    @Value("${appconfig.abstactFactotySkin}")
    private static String skinFacoty="SpringSkin";

    private static ISkinFactory getSkinFactory()
    {
        //通过类名生成实例对象并将其返回
        ISkinFactory obj= null;
        Class c= null;
        try {
            c = Class.forName("com.example.studypattern.abstractfactory."+skinFacoty+"Factory");
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
