package com.example.studypattern.simplefactory;

/**
 * Created by Administrator on 2018/4/4.
 */
public class Program {
    public static void main(String[] args)
    {
        ISimple simple =Factory.creator(1);
        System.out.println(simple.show());

        System.out.println("--------");

        simple =Factory.creator(2);
        System.out.println(simple.show());
    }
}
