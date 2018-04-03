package com.example.studypattern.simplefactory;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Factory {
    public static ISimple creator(int which)
    {
        if(which==1)
        {
            return new MySample();
        }
        else// if(which==2)
        {
            return new HiSimple();
        }
    }
}
