package com.example.studypattern.creational.simplefactory;

/**
 * 改进型
 */
public class Program2 {
    public static void main(String[] args)
    {
        Context context = new Context("CIRCLE"); //这个还可以通过读配置文件进一步改进
        context.draw();

        context = new Context("RECTANGLE");
        context.draw();

        context = new Context("SQUARE");
        context.draw();
    }
}
