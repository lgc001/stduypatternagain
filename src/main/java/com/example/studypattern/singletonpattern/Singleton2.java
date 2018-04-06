package com.example.studypattern.singletonpattern;

/**
 * 懒汉模式,双重校验锁
 * 双重校验锁即实现了延迟加载，又解决了线程并发问题，同时还解决了执行效率问题
 */
public class Singleton2 {
    /*这个问题的关键就在于由于指令重排优化的存在，导致初始化Singleton和将对象地址赋给instance字段的顺序是不确定的。
    在某个线程创建单例对象时，在构造方法被调用之前，就为该对象分配了内存空间并将对象的字段设置为默认值。
    此时就可以将分配的内存地址赋值给instance字段了，然而该对象可能还没有初始化。
    若紧接着另外一个线程来调用getInstance，取到的就是状态不正确的对象，程序就会出错。*/
    //private static Singleton2 instance=null;

    /*以上就是双重校验锁会失效的原因，不过还好在JDK1.5及之后版本增加了volatile关键字。
    在JDK1.5及之后版本增加了volatile关键字。volatile的一个语义是禁止指令重排序优化，
    也就保证了instance变量被赋值的时候对象已经是初始化过的*/
    private static volatile Singleton2 instance = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }

        return instance;
    }
}
