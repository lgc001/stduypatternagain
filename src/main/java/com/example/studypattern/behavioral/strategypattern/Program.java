package com.example.studypattern.behavioral.strategypattern;

/**
 * Created by Administrator on 2018/4/6.
 */
public class Program {
    public static void main(String[] args) {
        Context context = new Context(new Circle());
        context.draw();

        context = new Context(new Rectangle());
        context.draw();

        context = new Context(new Square());
        context.draw();
    }
}
