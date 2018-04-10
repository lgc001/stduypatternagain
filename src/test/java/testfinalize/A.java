package testfinalize;

public class A {
    Object a = null;

    public A() {

        a = new Object();

        System.out.println("创建a对象");

    }

    protected void destroy() {

        System.out.println("释放a对象");

        a = null;

        // 释放自身所占用的资源


    }

    protected void finalize() throws java.lang.Throwable {

        destroy();

        // 递归调用超类中的finalize方法

        super.finalize();

    }
}
