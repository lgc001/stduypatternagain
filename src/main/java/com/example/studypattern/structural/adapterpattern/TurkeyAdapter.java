package com.example.studypattern.structural.adapterpattern;

/**
 * 适配器来模仿鸭子
 */
public class TurkeyAdapter implements IDuck {

    private ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) { //火鸡飞的近，所以飞5次
            turkey.fly();
        }
    }
}
