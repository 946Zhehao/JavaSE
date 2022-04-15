package Reflect;
/*
可变长度参数
    int... args就是可变长度参数
    语法：类型... 变量名
    1、可变长度参数要求参数个数是：0~N个
    2、可变长度参数在参数列表中必须是最后一个位置上，而且可变长度参数只能有1个
    3、可变长度参数可以当做一个数组来看待
 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10, 20);

        m1(10, "xzc");
        m1(10, "asd", "xasd");
        m1(30, "Asdzx", "zczx", "ASDXZ");

        String[] strs = {"我", "是", "xxx"};
        m2(strs);
        //以上两行代码可直接写成这样
        m2("我", "是", "xxx");
    }

    public static void m(int... args) {
        System.out.println("m方法执行！");
    }

    public static void m1(int a, String... args) {
        System.out.println("m1方法执行");
    }

    //可变长度参数有length属性
    public static void m2(String... args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
