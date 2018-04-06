package com.example.studypattern.simplefactory;

/**
 * Created by Administrator on 2018/4/6.
 */
public class Program2 {
    public static void main(String[] args)
    {
        Context context = new Context("CIRCLE");
        context.draw();

        context = new Context("RECTANGLE");
        context.draw();

        context = new Context("SQUARE");
        context.draw();
    }
}
