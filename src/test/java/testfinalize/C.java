package testfinalize;

public class C extends B {
    Object c = null;

    public C() {

        c = new Object();

        System.out.println("创建c对象");

    }

    protected void destroy() {

        c = null;

        // 释放自身所占用的资源

        System.out.println("释放c对象");

        super.destroy();

    }

    protected void finalize()throws java.lang.Throwable {

        destroy();

        // 递归调用超类中的finalize方法

        super.finalize();

    }
}
