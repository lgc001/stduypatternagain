package testfinalize;

public class B extends A {
    Object b = null;

    public B() {

        b = new Object();

        System.out.println("创建b对象");

    }

    protected void destroy() {

        b = null;

        // 释放自身所占用的资源

        System.out.println("释放b对象");

        super.destroy();

    }

    protected void finalize() throws java.lang.Throwable {

        destroy();

        // 递归调用超类中的finalize方法

        super.finalize();

    }
}
