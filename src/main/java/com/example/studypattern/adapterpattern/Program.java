package com.example.studypattern.adapterpattern;

public class Program {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

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
