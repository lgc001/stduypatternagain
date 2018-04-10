package testfinalize;

/*finalize方法最终是由JVM中的垃圾回收器调用的，由于垃圾回收器调用finalize的时间是不确定或者不及时的，
调用时机对我们来说是不可控的，因此，有时我们需要通过其他的手段来释放程序中所占用的系统资源，比如自己在类中声明一个destroy()方法，
在这个方法中添加释放系统资源的处理代码，当你使用完该对象后可以通过调用这个destroy()方法来释放该对象内部成员占用的系统资源。
虽然我们可以通过调用自己定义的destroy()方法释放系统资源，但是还是建议你最好将对destroy()方法的调用放入当前类的finalize()方法体中，
因为这样做更保险，更安全。在类深度继承的情况下，这种方法就显得更为有效了，
我们可以通过递归调用destroy的方法在子类被销毁的时候释放父类所占用的资源*/
public class Program {
    C c = null;

    public Program() {

        c = new C();

    }

    public static void main(String args[]) {

        Program me = new Program();

        me.destroy();

    }

    protected void destroy() {

        if (c != null) {

            c.destroy();

        } else {

            System.out.println("c对象已被释放");

        }

    }
}
