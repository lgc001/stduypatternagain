package com.example.studypattern.structural.adapterpattern;

public class Program {
    public static void main(String[] args){
        //绿头鸭
        MallardDuck duck = new MallardDuck();

        //野火鸡
        WildTurkey turkey =new WildTurkey();
        IDuck turkeyAdapter = new TurkeyAdapter(turkey);

        turkey.gobble();
        turkey.fly();

        System.out.println("---------------");

        testDuck(duck);

        System.out.println("---------------");

        testDuck(turkeyAdapter);
    }

    static void testDuck(IDuck duck)
    {
        duck.quack();
        duck.fly();
    }
}
