package Reflect;

public class User {
    public User() {
        System.out.println("无参数构造方法！");
    }

    static {
        System.out.println("静态代码块执行！");
    }
}
