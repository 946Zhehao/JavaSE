package InsideClass;
/*
*
*       1、内部类：在类的内部又定义了一个新的类，称为内部类
*       2、内部类的分类：
*           静态内部类：类似于静态变量
*           实例内部类：类似于实例变量
*           局部内部类：类似于局部变量
*       3、使用内部类编写的代码，可读性较差，尽量不用
*       4、可以使用public，protected，private，修饰
*       5、匿名内部类不建议使用，不易懂
 */
public class Test {
    public static void main(String[] args) {
        /*
        //匿名内部类
        Compute c = new Compute() {
            public void sum(int a, int b) {
                System.out.println(a+b);
            }
        };
        c.sum(10, 20);
        */
        MyMath mm = new MyMath();
        //匿名内部类
        mm.doSome(new Compute() {
            @Override
            public void sum(int a, int b) {
                System.out.println(a+b);
            }
        }, 10 , 50);
    }
}

