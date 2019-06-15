package com.example.studypattern.creational.singletonpattern;

/**
 * 使用枚举类实现单例模式，借助枚举类天然的在IO类与反射类方面的特殊处理，
 * 可以天然的防反射攻击，防序列化与反序列化破坏。这样实现的单例模式既简单又安全。
 *
 * 优点：相对于其他单例来说枚举写法最简单，并且任何情况下都是单例的，JDK1.5之后才有的。
 */
public enum Singleton4 {
    INSTANCE;

    public static Singleton4 getInstance(){
        return INSTANCE;
    }

    public void print() {
        System.out.println("ffffffffffff");
    }

    public static void main(String[] args) {
        Singleton4 in = Singleton4.getInstance();
        in.print();
    }
}
