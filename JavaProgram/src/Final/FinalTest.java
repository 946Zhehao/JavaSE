package Final;

public class FinalTest {
    public static void main(String[] args) {
        //
        Nal n = new Nal();
        n.run();
        //
        Fin f = new Fin();
        f.run();
        //f之前指向的对象会被垃圾回收器回收，从而指向新的对象
        f = new Fin();

        //若用final修饰, f2指向的对象将持续到程序终止，不会再指向其他对象
        final Fin f2 = new Fin();
        //但final修饰的引用指向的对象内部的数据是可以修改的
        f2.a = 20;
        f2.a = 50;

    }

    //final一般和static联合使用，成为常量
    final static int c = 20;
}
