package com.example.studypattern.singletonpattern;

/**
 * 饿汉模式
 * 这种实现方式适合单例占用内存比较小，在初始化时就会被用到的情况。
 * 但是，如果单例占用的内存比较大，或单例只是在某个特定场景下才会用到，使用饿汉模式就不合适了，这时候就需要用到懒汉模式进行延迟加载。
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
